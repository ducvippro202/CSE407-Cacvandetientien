package quanlydonhang;

public class OrderProcessor implements IOrder{
	@Override
	public void iorder(Order order) 
	{
		System.out.println("Đơn hàng " + order.getOrderId() + "đã được xử lý");
	}
	
}

