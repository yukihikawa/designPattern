package domain;

/**
 * @program: designPattern
 * @description: Shape接口的抽象装饰类
 * @author: Rifu Wu
 * @create: 2022-02-07 20:56
 **/
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();

    }
}