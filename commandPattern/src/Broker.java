import order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designPattern
 * @description: ÃüÁîµ÷ÓÃÀà
 * @author: Rifu Wu
 * @create: 2022-02-11 17:24
 **/
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order : orderList)
            order.execute();
        orderList.clear();
    }
}