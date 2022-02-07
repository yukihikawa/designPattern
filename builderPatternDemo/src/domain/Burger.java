/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Burger.java
 *    Date:2022/1/30 下午3:54
 *    Author: wrf
 */

package domain;

/**
 * @program: Java-learning
 * @description: 实现Item接口的抽象类，提供默认功能
 * @author: Rifu Wu
 * @create: 2022-01-30 15:50
 **/
public abstract class Burger implements Item{
    @Override
    public Bottle packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}