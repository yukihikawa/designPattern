/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:ComputerFactory.java
 *    Date:2022/1/29 下午7:11
 *    Author: wrf
 */

package com.journaldev.design.factory;

/**
 * @program: Java-learning
 * @description:
 * @author: Rifu Wu
 * @create: 2022-01-29 19:10
 **/
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}