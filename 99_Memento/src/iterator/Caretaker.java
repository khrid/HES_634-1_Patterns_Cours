package iterator;

import java.util.ArrayList;

public class Caretaker {
    private Originator originator;
    private ArrayList<Memento> mementos = new ArrayList<>();

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void save() {
        System.out.print("Saving current state, ");
        mementos.add(originator.save());
        System.out.println("history size : "+mementos.size());
    }


    public void undo() {
        System.out.println("Restoring last saved state");
        mementos.get(mementos.size()-1).restore();
    }

    public void restoreAt(int index) {
        if(index > mementos.size()) {
            undo();
        } else {
            System.out.println("Restoring history at " + index);
            mementos.get(index).restore();
        }
    }
}

