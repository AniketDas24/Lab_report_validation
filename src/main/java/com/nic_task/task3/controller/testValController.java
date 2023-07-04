package com.nic_task.task3.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nic_task.task3.service.testValService;

@RestController
public class testValController {
    private final testValService testValService;

    public testValController(com.nic_task.task3.service.testValService testValService) {
        this.testValService = testValService;
    }
    @PostMapping("/validate")
    String result(@RequestParam("id") Integer id,@RequestParam("result") Double result,@RequestParam("unit") String unit,@RequestParam("gender") String gender, @RequestParam("age") Integer age)
    {
        return testValService.validate(id, result, unit, gender, age);
    }
    
}
