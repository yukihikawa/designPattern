package domain;

/**
 * @program: designPattern
 * @description: ShapeDecorator的实体类
 * @author: Rifu Wu
 * @create: 2022-02-07 21:42
 **/
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setReadBorder(decoratedShape);
    }

    private void setReadBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}