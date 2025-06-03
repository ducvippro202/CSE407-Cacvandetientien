package Mediator;

public abstract class Component {
    protected OrderMediator mediator;

    public Component(OrderMediator mediator) {
        this.mediator = mediator;
    }

    public void click() {
        mediator.notify(this, "click");
    }

    public void input(String data) {
        mediator.notify(this, "input:" + data);
    }
}
