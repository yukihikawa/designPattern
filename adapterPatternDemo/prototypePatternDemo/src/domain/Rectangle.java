/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:Rectangle.java
 *    Date:2022/2/2 ����10:32
 *    Author: wrf
 */

package domain;/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:domain.Rectangle.java
 *    Date:2022/2/2 ����10:06
 *    Author: wrf
 */

/**
 * @program: Java-learning
 * @description: ʵ����
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