package quanlydonhang;

public class OPrinterFactory extends OrderFactory {
	@Override
	public IOrder createIOrder() {
		return new OrderPrinter();
	}
}
