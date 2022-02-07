/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:FactoryPatternDemo.java
 *    Date:2022/1/29 ����11:06
 *    Author: wrf
 */

import domain.shape.Shape;
import factory.ShapeFactory;

/**
 * @program: Java-learning
 * @description: ����ģʽ����
 * @author: Rifu Wu
 * @create: 2022-01-29 11:06
 **/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }


}