package order;

import domain.Stock;

/**
 * @program: designPattern
 * @description:  µœ÷Order£¨¬Ú»Î√¸¡Ó
 * @author: Rifu Wu
 * @create: 2022-02-11 11:02
 **/
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}