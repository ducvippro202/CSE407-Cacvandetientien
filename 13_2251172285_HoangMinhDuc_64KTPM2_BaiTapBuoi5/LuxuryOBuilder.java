package HouseBuilder;

public class LuxuryOBuilder implements IOrder {
	private Order o = new Order();
	public void Reset()
	{
		o = new Order();
	}
	public void BuildOrderId()
	{
		o.OrderId = "Luxury";
	}
	public void BuildTotalAmount()
	{
		o.TotalAmount = 99999;
	}
	public void BuildPromotion()
	{
		o.Promotion = true;
	}
	public Order GetResult()
	{
		return o;
	}
}
