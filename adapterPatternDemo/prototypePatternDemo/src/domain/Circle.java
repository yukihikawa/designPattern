/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:Circle.java
 *    Date:2022/2/2 ����10:32
 *    Author: wrf
 */

package domain;/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:domain.Circle.java
 *    Date:2022/2/2 ����10:22
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