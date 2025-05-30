package Bridge;


import java.util.Random;


public class ClassicOrder extends Order implements IOrder {

    public void Reset() {
        this.OrderId = "";
        this.TotalAmount = 0;
        this.Promotion = false;
    }

    public void CreateOrderId() {
        Random r = new Random();
    	this.OrderId = r.toString();
        
    }

    public void CreateTotalAmount() {
        this.TotalAmount = 15000; 
    }

    public void Description() {
        System.out.println("Classic Order - ID: " + OrderId + ", Amount: $" + TotalAmount);
    }
}
