package com.nic_task.task3.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tests_val")
public class Tests_valEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="test_id")
    private Integer testId;

    @Column(name = "test_name")
    private String testName;

    @Column(name = "age_from")
    private Integer ageFrom;

    @Column(name = "age_to")
    private Integer ageTo;

    @Column(name = "gender")
    private String gender;

    @Column(name = "min_result")
    private Float minResult;

    @Column(name = "max_result")
    private Float maxResult;

    @Column(name = "unit")
    private String unit;

    public Tests_valEntity() {
    }

    public Tests_valEntity(Integer id, Integer testId, String testName, Integer ageFrom, Integer ageTo, String gender,
            Float minResult, Float maxResult, String unit) {
        this.id = id;
        this.testId = testId;
        this.testName = testName;
        this.ageFrom = ageFrom;
        this.ageTo = ageTo;
        this.gender = gender;
        this.minResult = minResult;
        this.maxResult = maxResult;
        this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(Integer ageFrom) {
        this.ageFrom = ageFrom;
    }

    public Integer getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Float getMinResult() {
        return minResult;
    }

    public void setMinResult(Float minResult) {
        this.minResult = minResult;
    }

    public Float getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(Float maxResult) {
        this.maxResult = maxResult;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    

}

    
