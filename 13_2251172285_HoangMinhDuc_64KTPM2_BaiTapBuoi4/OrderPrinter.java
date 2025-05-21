package AbstractFactory;

public class OrderPrinter implements IOrder {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Printing order: " + order.getOrderId());
    }
}
