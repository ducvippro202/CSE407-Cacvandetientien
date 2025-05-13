package quanlydonhang;

public class Main {
	public static void main(String[] args) {
		Order o = new Order("May1 ", 500.0);
		
		OProcessorFactory prof = new OProcessorFactory();
		IOrder pro = prof.createIOrder();
		pro.iorder(o);
		
		OPrinterFactory prif = new OPrinterFactory();
		IOrder pri = prif.createIOrder();
		pri.iorder(o);
	}
}
