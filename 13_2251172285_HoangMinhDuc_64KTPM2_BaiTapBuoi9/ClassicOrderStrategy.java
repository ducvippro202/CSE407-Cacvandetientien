package Strategy;

public class ClassicOrderStrategy implements OrderStrategy {
    @Override
    public void processOrder(String details) {
        System.out.println("Don hang thuong: " + details);
    }
}
