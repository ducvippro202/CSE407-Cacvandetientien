package Strategy;

public class LuxuryOrderStrategy implements OrderStrategy {
    @Override
    public void processOrder(String details) {
        System.out.println("Don hang xa xi: " + details);
    }
}
