/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Circle.java
 *    Date:2022/1/29 下午8:45
 *    Author: wrf
 */

package domain.shape;

/**
 * @program: Java-learning
 * @description: 圆
 * @author: Rifu Wu
 * @create: 2022-01-29 11:03
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}