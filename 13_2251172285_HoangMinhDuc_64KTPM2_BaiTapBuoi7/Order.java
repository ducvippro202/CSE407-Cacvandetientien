package Bridge;


public class Order {
    protected String OrderId;
    protected double TotalAmount;
    protected boolean Promotion;

    public Order() {}

    public Order(String oi, double ta, boolean po) {
        this.OrderId = oi;
        this.TotalAmount = ta;
        this.Promotion = po;
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

    public boolean getPromotion() {
        return Promotion;
    }

    public void setPromotion(boolean po) {
        this.Promotion = po;
    }
}
