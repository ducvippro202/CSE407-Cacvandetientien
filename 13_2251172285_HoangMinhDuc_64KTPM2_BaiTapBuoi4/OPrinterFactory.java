package AbstractFactory;

public class OPrinterFactory extends OrderFactory {
    @Override
    public IOrder createHandler() {
        return new OrderPrinter();
    }
}

