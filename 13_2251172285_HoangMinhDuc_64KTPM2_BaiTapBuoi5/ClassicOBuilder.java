package HouseBuilder;

public class ClassicOBuilder implements IOrder{
	private Order o = new Order();
	public void Reset()
	{
		o = new Order();
	}
	public void BuildOrderId()
	{
		o.OrderId = "Classic";
	}
	public void BuildTotalAmount()
	{
		o.TotalAmount = 50000;
	}
	public void BuildPromotion()
	{
		o.Promotion = false;
	}
	public Order GetResult()
	{
		return o;
	}

}

