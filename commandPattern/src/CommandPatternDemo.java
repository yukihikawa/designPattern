import domain.Stock;
import order.BuyStock;
import order.SellStock;

/**
 * @program: designPattern
 * @description:
 * @author: Rifu Wu
 * @create: 2022-02-11 17:42
 **/
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}