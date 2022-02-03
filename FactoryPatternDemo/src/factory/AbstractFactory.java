/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:AbstractFactory.java
 *    Date:2022/1/29 下午10:29
 *    Author: wrf
 */

package factory;

import domain.color.Color;
import domain.shape.Shape;

/**
 * @program: Java-learning
 * @description:抽象工厂
 * @author: Rifu Wu
 * @create: 2022-01-29 22:29
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}