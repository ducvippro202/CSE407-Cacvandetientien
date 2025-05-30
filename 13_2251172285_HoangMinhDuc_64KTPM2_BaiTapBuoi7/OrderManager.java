package Bridge;


public class OrderManager {
    protected IOrder order;

    public OrderManager(IOrder order) {
        this.order = order;
    }

    public void Process() {
        order.Reset();
        order.CreateOrderId();
        order.CreateTotalAmount();
        order.Description();
    }
}
