package domain;

/**
 * @program: designPattern
 * @description:
 * @author: Rifu Wu
 * @create: 2022-02-11 00:57
 **/
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}