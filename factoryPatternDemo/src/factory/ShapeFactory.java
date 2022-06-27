/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:ShapeFactory.java
 *    Date:2022/1/29 上午11:05
 *    Author: wrf
 */

package factory;/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:factory.ShapeFactory.java
 *    Date:2022/1/29 上午12:22
 *    Author: wrf
 */

import domain.color.Color;
import domain.shape.Circle;
import domain.shape.Rectangle;
import domain.shape.Shape;
import domain.shape.Square;

/**
 * @program: Java-learning
 * @description: 工厂
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