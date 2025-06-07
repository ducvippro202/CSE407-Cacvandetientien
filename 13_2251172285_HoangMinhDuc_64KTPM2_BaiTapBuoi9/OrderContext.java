package Strategy;

public class OrderContext {
    private OrderStrategy strategy;

    public void setStrategy(OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(String details) {
        if (strategy != null) {
            strategy.processOrder(details);
        } else {
            System.out.println("No order strategy selected.");
        }
    }
}

