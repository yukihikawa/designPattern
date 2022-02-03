/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:TestFactory.java
 *    Date:2022/1/29 ����7:12
 *    Author: wrf
 */

package com.journaldev.design.test;

import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

/**
 * @program: Java-learning
 * @description:
 * @author: Rifu Wu
 * @create: 2022-01-29 19:12
 **/
public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }

}