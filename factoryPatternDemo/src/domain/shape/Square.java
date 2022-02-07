/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Square.java
 *    Date:2022/1/29 下午8:45
 *    Author: wrf
 */

package domain.shape;

/**
 * @program: Java-learning
 * @description: 方形
 * @author: Rifu Wu
 * @create: 2022-01-29 11:02
 **/
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}