import domain.Image;
import domain.ProxyImage;

/**
 * @program: designPattern
 * @description:
 * @author: Rifu Wu
 * @create: 2022-02-10 17:40
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");
        image.display();
    }
}