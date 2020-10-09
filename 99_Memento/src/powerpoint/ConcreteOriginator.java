package powerpoint;

public class ConcreteOriginator implements Originator {

    private String state;

    @Override
    public Memento save() {
        return new ConcreteMemento(this, state);
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ConcreteOriginator{" +
                "state='" + state + '\'' +
                '}';
    }
}
