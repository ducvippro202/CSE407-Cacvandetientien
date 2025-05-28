package objectAdapter;
public class LuxuryAdapter implements IOrder {
	private LuxuryOrder lo;
	public LuxuryAdapter(LuxuryOrder lo1)
	{
		lo = lo1;
	}
	public void Reset()
	{
		lo = new LuxuryOrder();
	}
	public void CreateOrderId()
	{
		lo.CreateOrderId();
	}
	public void CreateTotalAmount()
	{
		lo.CreateTotalAmount();
	}
	public void Description()
	{
		lo.code();
	}
}
