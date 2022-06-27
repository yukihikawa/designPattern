import domain.Circle;
import domain.Shape;

import java.util.HashMap;

/**
 * @program: designPattern
 * @description: ���ɻ��ڸ�����Ϣ��ʵ����Ķ���
 * @author: Rifu Wu
 * @create: 2022-02-10 00:30
 **/
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        //��HashMap��ȡ��Ӧ����
        Circle circle = (Circle) circleMap.get(color);

        //���������򴴽�������HashMap
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}