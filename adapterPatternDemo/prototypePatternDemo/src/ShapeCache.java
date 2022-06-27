/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:ShapeCacha.java
 *    Date:2022/2/2 上午10:34
 *    Author: wrf
 */
import domain.Circle;
import domain.Rectangle;
import domain.Shape;
import domain.Square;

import java.util.Hashtable;
/**
 * @program: Java-learning
 * @description: 从数据库获取实体，进行缓存
 * @author: Rifu Wu
 * @create: 2022-02-02 10:34
 **/
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
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