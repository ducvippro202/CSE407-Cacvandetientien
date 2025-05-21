package AbstractFactory;

public class OProcessorFactory extends OrderFactory {
    @Override
    public IOrder createHandler() {
        return new OrderProcessor();
    }
}
