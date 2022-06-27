package domain;

/**
 * @program: designPattern
 * @description: ´úÀí
 * @author: Rifu Wu
 * @create: 2022-02-10 17:33
 **/
public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if(realImage == null)
            realImage = new RealImage(filename);
        realImage.display();
    }
}