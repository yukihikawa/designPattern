package domain;

/**
 * @program: designPattern
 * @description:
 * @author: Rifu Wu
 * @create: 2022-02-11 01:00
 **/
public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}