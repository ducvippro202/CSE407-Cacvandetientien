package AbstractFactory;

public class Order {
	protected String OrderId;
	protected double TotalAmount;
	
	public Order (String oi, double ta)
	{
		this.OrderId = oi;
		this.TotalAmount = ta;
	}
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	

}
