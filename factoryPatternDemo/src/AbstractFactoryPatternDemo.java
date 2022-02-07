/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:AbstractFactoryPatternDemo.java
 *    Date:2022/1/29 ����10:53
 *    Author: wrf
 */

import domain.color.Color;
import domain.shape.Shape;
import factory.AbstractFactory;
import factory.FactoryProducer;

/**
 * @program: Java-learning
 * @description: ���󹤳������
 * @author: Rifu Wu
 * @create: 2022-01-29 22:53
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");


        //��ȡ��״Ϊ Circle �Ķ���
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //���� Circle �� draw ����
        shape1.draw();


        //��ȡ��״Ϊ Rectangle �Ķ���
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //���� Rectangle �� draw ����
        shape2.draw();

        //��ȡ��״Ϊ Square �Ķ���
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //���� Square �� draw ����
        shape3.draw();

        //��ȡ��ɫΪ Red �Ķ���
        Color color1 = colorFactory.getColor("RED");

        //���� Red �� fill ����
        color1.fill();

        //��ȡ��ɫΪ Green �Ķ���
        Color color2 = colorFactory.getColor("Green");

        //���� Green �� fill ����
        color2.fill();

        //��ȡ��ɫΪ Blue �Ķ���
        Color color3 = colorFactory.getColor("BLUE");

        //���� Blue �� fill ����
        color3.fill();
    }

}