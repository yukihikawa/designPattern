/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:ColdDrink.java
 *    Date:2022/1/30 下午4:16
 *    Author: wrf
 */

package domain;

/**
 * @program: Java-learning
 * @description: 实现Item接口的抽象类，提供默认功能
 * @author: Rifu Wu
 * @create: 2022-01-30 16:16
 **/
public abstract class ColdDrink implements Item{
    @Override
    public Bottle packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}