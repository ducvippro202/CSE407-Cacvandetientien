package Mediator;

public class SubmitButton extends Component {
    public SubmitButton(OrderMediator mediator) {
        super(mediator);
    }

    public void press() {
        click();
    }
}
