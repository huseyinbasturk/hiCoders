package jam101.week09;

import java.util.ArrayList;
import java.util.List;

public class OrderedProduct {

    private static ArrayList<OrderLine> orderLineList = new ArrayList<>();
    private static double totalPrice;

    public static void addToList(OrderLine orderLine) {
        orderLineList.add(orderLine);

    }

    public static void calculateTotalPrice(double price) {
        for(OrderLine o : orderLineList) {
            totalPrice += o.getTotalItemPrice();
        }
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static ArrayList<OrderLine> getOrderLineList() {
        return orderLineList;
    }
}
