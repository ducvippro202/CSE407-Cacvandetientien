package quanlydonhang;

public class OProcessorFactory extends OrderFactory{
	@Override
	public IOrder createIOrder()
	{
		return new OrderProcessor();
	}
}
