package Mediator;

public class OrderTextbox extends Component {
    private String text;

    public OrderTextbox(OrderMediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        this.text = text;
        input(text);
    }

    public String getText() {
        return text;
    }
}
