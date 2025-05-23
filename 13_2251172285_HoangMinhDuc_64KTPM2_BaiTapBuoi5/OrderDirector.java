package HouseBuilder;

public class OrderDirector {
	private IOrder builders;
	public OrderDirector(IOrder builder)
	{
		builders = builder;
	}
	public void ChangBuilder(IOrder builder)
	{
		builders = builder;
	}
	public void MakeClassicOrder()
	{
		builders.Reset();
		builders.BuildOrderId();
		builders.BuildTotalAmount();
	}
	public void MakeLuxuryOrder()
	{
		builders.Reset();
		builders.BuildOrderId();
		builders.BuildTotalAmount();
		builders.BuildPromotion();
	}
}
