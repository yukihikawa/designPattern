import domain.Circle;
import domain.Rectangle;
import domain.Shape;
import domain.Square;

/**
 * @program: designPattern
 * @description: Õ‚π€¿‡
 * @author: Rifu Wu
 * @create: 2022-02-07 23:47
 **/
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}