package Mediator;

public class OrderDialog implements OrderMediator {
    private OrderTypeCheckbox orderTypeCheckbox;
    private OrderTextbox orderTextbox;
    private SubmitButton submitButton;

    public OrderDialog() {
        orderTypeCheckbox = new OrderTypeCheckbox(this);
        orderTextbox = new OrderTextbox(this);
        submitButton = new SubmitButton(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == orderTypeCheckbox && event.equals("toggle")) {
            System.out.println("Loai don hang muon chuyen: " + 
                (orderTypeCheckbox.isOnline() ? "Online" : "Classic"));
        }

        if (sender == submitButton && event.equals("click")) {
            String content = orderTextbox.getText();
            if (content == null || content.isEmpty()) {
                System.out.println("Hay nhap mo ta.");
                return;
            }

            if (orderTypeCheckbox.isOnline()) {
                System.out.println("Tao don online voi noi dung: " + content);

            } else {
                System.out.println("Tao don classic voi noi dung: " + content);

            }
        }

        if (event.startsWith("nhap:")) {
            System.out.println("Nguoi dung nhap du lieu don hang: " + event.substring(6));
        }
    }


    public OrderTypeCheckbox getCheckbox() { return orderTypeCheckbox; }
    public OrderTextbox getTextbox() { return orderTextbox; }
    public SubmitButton getSubmitButton() { return submitButton; }
}
