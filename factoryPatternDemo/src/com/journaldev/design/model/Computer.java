/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Computer.java
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
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}