package com.nic_task.task3.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.nic_task.task3.entity.Tests_valEntity;
import com.nic_task.task3.repository.TestsvalRepository;
import com.nic_task.task3.service.testValService;


@Service
public class testValServiceImpl implements testValService{

    private final TestsvalRepository testsvalRepository;
    
    public testValServiceImpl(TestsvalRepository testsvalRepository) {
        this.testsvalRepository = testsvalRepository;
    }

    @Override
    public String validate(Integer id, Double result, String unit, String gender, Integer age) {
        List<Tests_valEntity> ls;
        ls = testsvalRepository.findByTestIdAndGender(id, gender);
        for(int i=0; i<ls.size(); i++)
        {
            if((ls.get(i).getAgeFrom() <=age) && (ls.get(i).getAgeTo()>=age))
            {
                if(result>ls.get(i).getMaxResult())
                {
                    return "High "+ls.get(i).getTestName();
                }
                if(result<ls.get(i).getMinResult())
                {
                    return "Low "+ls.get(i).getTestName();
                }
                return "Moderate " + ls.get(i).getTestName();
            }
        } 
        return "No results found";
    }

}
