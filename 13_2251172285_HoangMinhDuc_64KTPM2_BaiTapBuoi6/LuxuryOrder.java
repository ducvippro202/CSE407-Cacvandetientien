package objectAdapter;

public class LuxuryOrder {
	private Order o = new Order();
	public void Reset()
	{
		o = new Order();
	}
	public void CreateOrderId()
	{
		o.OrderId = "Luxury";
	}
	public void CreateTotalAmount()
	{
		o.TotalAmount = 99999;
	}
	public void code()
	{
		System.out.println("Day la don vippro");
	}
}
