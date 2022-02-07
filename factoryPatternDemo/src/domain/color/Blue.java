/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Blue.java
 *    Date:2022/1/29 下午10:29
 *    Author: wrf
 */

package domain.color;

/**
 * @program: Java-learning
 * @description:
 * @author: Rifu Wu
 * @create: 2022-01-29 22:29
 **/
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
}