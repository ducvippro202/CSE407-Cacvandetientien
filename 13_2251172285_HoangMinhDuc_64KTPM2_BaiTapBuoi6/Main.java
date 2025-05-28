
package objectAdapter;


public class Main {
	public static void main(String[] args) {
		ClassicOrder co = new ClassicOrder();
		LuxuryOrder lo = new LuxuryOrder();
		IOrder classicOrder = new ClassicAdapter(co);
		IOrder luxuryOrder = new LuxuryAdapter(lo);
		System.out.println("Don hang cua ban la:");
		classicOrder.Description();
		luxuryOrder.Description();
	}
	
}
