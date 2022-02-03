/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:PC.java
 *    Date:2022/1/29 下午7:03
 *    Author: wrf
 */

package com.journaldev.design.model;

/**
 * @program: Java-learning
 * @description:
 * @author: Rifu Wu
 * @create: 2022-01-29 19:03
 **/
public class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}