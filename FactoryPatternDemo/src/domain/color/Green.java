/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Green.java
 *    Date:2022/1/29 下午9:36
 *    Author: wrf
 */

package domain.color;

/**
 * @program: Java-learning
 * @description:
 * @author: Rifu Wu
 * @create: 2022-01-29 21:36
 **/
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method");
    }
}