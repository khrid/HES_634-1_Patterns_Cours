package ex1_MobilePhone.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Doing nothing...");
    }

    @Override
    public void undo() {
        System.out.println("Doing nothing...");
    }
}
