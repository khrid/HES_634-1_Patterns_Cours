package iterator;

public class MementoIteratorLauncher {
    public static void main(String[] args) {
        // The object we want to save
        ConcreteOriginator concreteOriginator = new ConcreteOriginator();
        // Setting the state (<- what we will save/restore)
        concreteOriginator.setState("Original state");
        // Displaying the object
        System.out.println(concreteOriginator);
        // Defining the caretaker who will take care of saving and restoring the object through the powerpoint.Memento
        Caretaker caretaker = new Caretaker(concreteOriginator);
        // Saving the current state
        caretaker.save(); // <- history 0
        // Changing the state of the Originator
        concreteOriginator.setState("State n° 2");
        // Saving the current state
        caretaker.save(); // <- history 1
        // Changing the state of the Originator
        concreteOriginator.setState("State n° 3");
        // Saving the current state
        caretaker.save(); // <- history 2
        // Changing the state of the Originator
        concreteOriginator.setState("State n° 4");
        // Saving the current state
        caretaker.save();  // <- history 3
        // Displaying the object
        System.out.println(concreteOriginator);
        // Restoring previously saved state
        caretaker.restoreAt(0);
        // Displaying the object
        System.out.println(concreteOriginator);
        // Restoring previously saved state
        caretaker.restoreAt(10);
        // Displaying the object
        System.out.println(concreteOriginator);
    }
}


