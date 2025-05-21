package AbstractFactory;

public class App {
    private OrderFactory factory;
    private IOrder handler;

    public App(OrderFactory factory) {
        this.factory = factory;
    }

    public void createHandler() {
        this.handler = factory.createHandler();
    }

    public void process(Order order) {
        handler.handleOrder(order);
    }

    public static void main(String[] args) {

        OrderFactory factory = new OProcessorFactory();  
        App app = new App(factory);

        app.createHandler();
        Order order = new Order("maygido",500000);
        app.process(order);
    }
}
