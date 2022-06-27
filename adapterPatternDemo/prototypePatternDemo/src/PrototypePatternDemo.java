/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:PrototypePatternDemo.java
 *    Date:2022/2/3 上午10:45
 *    Author: wrf
 */

import domain.Shape;

/**
 * @program: Java-learning
 * @description: 原型模式测试
 * @author: Rifu Wu
 * @create: 2022-02-03 10:45
 **/
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache(); //载入

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());
    }
}