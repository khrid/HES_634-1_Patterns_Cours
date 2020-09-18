package lab1.ex1;

public class MedicalEmployee implements Observer {
    String name;
    Subject subject;

    public MedicalEmployee(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int position, Problem p, int bloodPressure, int electroCardioGram,  int pulseOximetry) {
        System.out.print("Employee " + name + " receives notification: ");
        System.out.println("Position " + position + " Problem " + p + " bloodPressure " + bloodPressure + " electroCardioGram " + electroCardioGram + " pulseOximetry " + pulseOximetry);
    }
}
