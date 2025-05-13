package quanlydonhang;

public class OrderPrinter implements IOrder{
	@Override
	public void iorder(Order order) 
	{
		System.out.println("Đơn hàng " + order.getOrderId() + "có tổng tiền: " + order.getTotalAmount());
	}
}
