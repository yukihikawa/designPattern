package com.wrf.domain;

/**
 * @program: designPattern
 * @description: 在该类上应用标准
 * @author: Rifu Wu
 * @create: 2022-02-07 01:00
 **/
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}