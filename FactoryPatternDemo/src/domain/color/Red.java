/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Red.java
 *    Date:2022/1/29 下午9:09
 *    Author: wrf
 */

package domain.color;

/**
 * @program: Java-learning
 * @description:
 * @author: Rifu Wu
 * @create: 2022-01-29 21:09
 **/
public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
}