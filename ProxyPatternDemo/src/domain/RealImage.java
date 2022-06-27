package domain;

/**
 * @program: designPattern
 * @description:  µÃÂ¿‡
 * @author: Rifu Wu
 * @create: 2022-02-10 15:56
 **/
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String Filename){
        System.out.println("Loading " + fileName);
    }
}
