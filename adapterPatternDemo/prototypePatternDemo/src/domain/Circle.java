/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Circle.java
 *    Date:2022/2/2 上午10:32
 *    Author: wrf
 */

package domain;/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:domain.Circle.java
 *    Date:2022/2/2 上午10:22
 *    Author: wrf
 */

/**
 * @program: Java-learning
 * @description:
 * @author: Rifu Wu
 * @create: 2022-02-02 10:22
 **/
public class Circle extends Shape {

    public Circle(){
        type = "domain.Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside domain.Circle::draw() method.");
    }
}