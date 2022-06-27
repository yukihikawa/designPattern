/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:ShapeFactory.java
 *    Date:2022/1/29 ����11:05
 *    Author: wrf
 */

package factory;/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:factory.ShapeFactory.java
 *    Date:2022/1/29 ����12:22
 *    Author: wrf
 */

import domain.color.Color;
import domain.shape.Circle;
import domain.shape.Rectangle;
import domain.shape.Shape;
import domain.shape.Square;

/**
 * @program: Java-learning
 * @description: ����
 * @author: Rifu Wu
 * @create: 2022-01-29 00:22
 **/
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }


    public Shape getShape(String shapeType){
        switch (shapeType.toUpperCase()){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}