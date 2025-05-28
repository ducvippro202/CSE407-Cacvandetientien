package objectAdapter;

public class ClassicOrder{
	private Order o = new Order();
	public void Reset()
	{
		o = new Order();
	}
	public void CreateOrderId()
	{
		o.OrderId = "Classic";
	}
	public void CreateTotalAmount()
	{
		o.TotalAmount = 50000;
	}
	public void Describe()
	{
		System.out.println("day la don co ban");
	}
}

