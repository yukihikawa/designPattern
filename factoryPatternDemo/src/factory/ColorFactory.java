/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:ColorFactory.java
 *    Date:2022/1/29 下午10:36
 *    Author: wrf
 */

package factory;

import domain.color.Blue;
import domain.color.Color;
import domain.color.Green;
import domain.color.Red;
import domain.shape.Circle;
import domain.shape.Rectangle;
import domain.shape.Shape;
import domain.shape.Square;

/**
 * @program: Java-learning
 * @description:工厂类
 * @author: Rifu Wu
 * @create: 2022-01-29 22:36
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color.toUpperCase()){
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            case "RED":
                return new Red();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}