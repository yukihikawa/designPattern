/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Square.java
 *    Date:2022/2/2 上午10:32
 *    Author: wrf
 */

package domain;/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:domain.Square.java
 *    Date:2022/2/2 上午10:08
 *    Author: wrf
 */

/**
 * @program: Java-learning
 * @description: 实体类
 * @author: Rifu Wu
 * @create: 2022-02-02 10:07
 **/
public class Square extends Shape {

    public Square(){
        type = "domain.Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside domain.Square::draw() method.");
    }
}