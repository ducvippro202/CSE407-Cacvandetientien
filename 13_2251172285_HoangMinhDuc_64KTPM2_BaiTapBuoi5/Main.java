package HouseBuilder;

public class Main {
	 public static void main(String[] args) {

	        IOrder classicBuilder = new ClassicOBuilder();
	        OrderDirector director1 = new OrderDirector(classicBuilder);
	        director1.MakeClassicOrder();
	        Order classicOrder = classicBuilder.GetResult();
	        System.out.println("Classic Order:");
	        System.out.println(classicOrder);

	        IOrder luxuryBuilder = new LuxuryOBuilder();
	        OrderDirector director2 = new OrderDirector(luxuryBuilder);
	        director2.MakeLuxuryOrder();;
	        Order luxuryOrder = luxuryBuilder.GetResult();
	        System.out.println("Luxury Order:");
	        System.out.println(luxuryOrder);
	    }
}
