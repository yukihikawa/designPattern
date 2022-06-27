/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Rectangle.java
 *    Date:2022/2/2 上午10:32
 *    Author: wrf
 */

package domain;/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:domain.Rectangle.java
 *    Date:2022/2/2 上午10:06
 *    Author: wrf
 */

/**
 * @program: Java-learning
 * @description: 实体类
 * @author: Rifu Wu
 * @create: 2022-02-02 10:06
 **/
public class Rectangle extends Shape{
    public Rectangle() {
        type = "domain.Rectangle";
    }

    @Override


    void draw() {
        System.out.println("Inside domain.Rectangle::draw() method.");
    }
}