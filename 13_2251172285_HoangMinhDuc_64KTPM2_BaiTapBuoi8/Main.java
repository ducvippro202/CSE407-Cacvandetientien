package Mediator;

public class Main {
    public static void main(String[] args) {
        OrderDialog dialog = new OrderDialog();

        dialog.getTextbox().setText("Order #001: 3 books");
        dialog.getSubmitButton().press();

        dialog.getCheckbox().toggle(); 
        dialog.getTextbox().setText("Order #002: 1 laptop");
        dialog.getSubmitButton().press();
    }
}
