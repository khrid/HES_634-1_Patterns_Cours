package powerpoint;

public class MementoLauncher {
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
        caretaker.save();
        // Changing the state of the powerpoint.Originator
        concreteOriginator.setState("Changed state");
        // Displaying the object
        System.out.println(concreteOriginator);
        // Restoring previously saved state
        caretaker.undo();
        // Displaying the object
        System.out.println(concreteOriginator);
    }
}


