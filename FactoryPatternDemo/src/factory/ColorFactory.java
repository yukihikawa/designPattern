/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:ColorFactory.java
 *    Date:2022/1/29 ����10:36
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
 * @description:������
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