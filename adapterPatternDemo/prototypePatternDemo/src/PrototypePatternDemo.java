/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:PrototypePatternDemo.java
 *    Date:2022/2/3 ����10:45
 *    Author: wrf
 */

import domain.Shape;

/**
 * @program: Java-learning
 * @description: ԭ��ģʽ����
 * @author: Rifu Wu
 * @create: 2022-02-03 10:45
 **/
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache(); //����

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());
    }
}