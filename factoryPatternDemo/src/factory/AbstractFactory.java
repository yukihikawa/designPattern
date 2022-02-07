/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:AbstractFactory.java
 *    Date:2022/1/29 ����10:29
 *    Author: wrf
 */

package factory;

import domain.color.Color;
import domain.shape.Shape;

/**
 * @program: Java-learning
 * @description:���󹤳�
 * @author: Rifu Wu
 * @create: 2022-01-29 22:29
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}