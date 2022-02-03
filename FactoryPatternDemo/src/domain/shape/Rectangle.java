/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Rectangle.java
 *    Date:2022/1/29 下午8:45
 *    Author: wrf
 */

package domain.shape;

/**
 * @program: Java-learning
 * @description: 三角形
 * @author: Rifu Wu
 * @create: 2022-01-29 11:00
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}