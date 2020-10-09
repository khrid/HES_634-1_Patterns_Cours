package iterator;

public class ConcreteMemento implements Memento {

    private ConcreteOriginator originator;
    private String state;

    public ConcreteMemento(ConcreteOriginator originator, String state) {
        this.originator = originator;
        this.state = state;
    }

    @Override
    public void restore() {
        originator.setState(state);
    }
}
