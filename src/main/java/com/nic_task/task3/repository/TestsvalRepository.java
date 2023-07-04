package com.nic_task.task3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nic_task.task3.entity.Tests_valEntity;

public interface TestsvalRepository extends JpaRepository<Tests_valEntity, Integer>{
    List<Tests_valEntity> findByTestIdAndGender(Integer TestId, String gender);
}
