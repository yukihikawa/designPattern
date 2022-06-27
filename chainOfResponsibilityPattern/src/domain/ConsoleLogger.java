package domain;

/**
 * @program: designPattern
 * @description:  µÃÂ¿‡
 * @author: Rifu Wu
 * @create: 2022-02-11 00:46
 **/
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}