package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderContext context = new OrderContext();

        System.out.println("Nhap loai don hang (classic/luxury):");
        String type = scanner.nextLine();

        System.out.println("Nhap mo ta don hang:");
        String details = scanner.nextLine();

        if ("classic".equalsIgnoreCase(type)) {
            context.setStrategy(new ClassicOrderStrategy());
        } else if ("luxury".equalsIgnoreCase(type)) {
            context.setStrategy(new LuxuryOrderStrategy());
        } else {
            System.out.println("Don hang khong ro.");
            return;
        }

        context.executeStrategy(details);
    }
}
