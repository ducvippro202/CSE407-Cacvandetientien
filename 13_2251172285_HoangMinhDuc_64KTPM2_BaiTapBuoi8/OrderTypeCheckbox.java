package Mediator;

public class OrderTypeCheckbox extends Component {
    private boolean isOnline = true;

    public OrderTypeCheckbox(OrderMediator mediator) {
        super(mediator);
    }

    public void toggle() {
        isOnline = !isOnline;
        mediator.notify(this, "toggle");
    }

    public boolean isOnline() {
        return isOnline;
    }
}
