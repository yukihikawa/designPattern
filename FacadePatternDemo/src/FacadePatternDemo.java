/**
 * @program: designPattern
 * @description:
 * @author: Rifu Wu
 * @create: 2022-02-07 23:45
 **/
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }


}