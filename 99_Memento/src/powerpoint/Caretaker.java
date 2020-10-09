package powerpoint;

public class Caretaker {
    private Originator originator;
    private Memento history;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void save() {
        System.out.println("Saving current state");
        history = originator.save();
    }


    public void undo() {
        System.out.println("Restoring saved state");
        history.restore();
    }
}

