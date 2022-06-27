package order;

import domain.Stock;

/**
 * @program: designPattern
 * @description: Âô³öÃüÁî
 * @author: Rifu Wu
 * @create: 2022-02-11 16:16
 **/
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}