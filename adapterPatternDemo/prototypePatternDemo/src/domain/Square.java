/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:Square.java
 *    Date:2022/2/2 ����10:32
 *    Author: wrf
 */

package domain;/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:domain.Square.java
 *    Date:2022/2/2 ����10:08
 *    Author: wrf
 */

/**
 * @program: Java-learning
 * @description: ʵ����
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