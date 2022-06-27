import domain.Circle;
import domain.Shape;

import java.util.HashMap;

/**
 * @program: designPattern
 * @description: 生成基于给定信息的实体类的对象
 * @author: Rifu Wu
 * @create: 2022-02-10 00:30
 **/
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        //从HashMap获取对应对象
        Circle circle = (Circle) circleMap.get(color);

        //若不存在则创建并放入HashMap
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}