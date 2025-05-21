package AbstractFactory;

public class OrderProcessor implements IOrder {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Processing order: " + order.getOrderId());
    }
}
