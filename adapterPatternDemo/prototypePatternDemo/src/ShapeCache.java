/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:ShapeCacha.java
 *    Date:2022/2/2 ����10:34
 *    Author: wrf
 */
import domain.Circle;
import domain.Rectangle;
import domain.Shape;
import domain.Square;

import java.util.Hashtable;
/**
 * @program: Java-learning
 * @description: �����ݿ��ȡʵ�壬���л���
 * @author: Rifu Wu
 * @create: 2022-02-02 10:34
 **/
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // ��ÿ����״���������ݿ��ѯ������������״
    // shapeMap.put(shapeKey, shape);
    // ���磬����Ҫ���������״
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}