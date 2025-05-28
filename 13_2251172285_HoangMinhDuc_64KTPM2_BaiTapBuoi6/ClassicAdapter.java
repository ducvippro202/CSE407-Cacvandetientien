package objectAdapter;

public class ClassicAdapter implements IOrder{
	private ClassicOrder co;
	public ClassicAdapter(ClassicOrder co1)
	
	{
		co = co1;
	}
	public void Reset()
	{
		co = new ClassicOrder();
	}
	public void CreateOrderId()
	{
		co.CreateOrderId();
	}
	public void CreateTotalAmount()
	{
		co.CreateTotalAmount();
	}
	public void Description()
	{
		co.Describe();
	}
}
