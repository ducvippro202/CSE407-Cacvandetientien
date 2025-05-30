package Bridge;


public class Main {
    public static void main(String[] args) {
        IOrder classicOrder = new ClassicOrder();

       
        OrderManager orderManager = new OrderManager(classicOrder);
        orderManager.Process();


        AdvancedOrderManager advancedOrderManager = new AdvancedOrderManager(classicOrder);
        advancedOrderManager.Process();
        advancedOrderManager.ApplyPromotion();
        advancedOrderManager.GenerateInvoice();
    }
}
