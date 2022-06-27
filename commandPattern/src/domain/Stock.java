package domain;

/**
 * @program: designPattern
 * @description: «Î«Û¿‡
 * @author: Rifu Wu
 * @create: 2022-02-11 11:16
 **/
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +
                " ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +
                " ] sold");
    }
}