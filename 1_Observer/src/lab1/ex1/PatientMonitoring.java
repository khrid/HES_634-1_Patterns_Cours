package lab1.ex1;

import java.util.ArrayList;

public class PatientMonitoring implements Subject {

    /**
     * @uml.property  name="observers"
     * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="patientMonitoring:lab1.ex1.Observer"
     */
    private ArrayList<Observer> observers;

    private int bloodPressure;
    private int maxBloodPressure;
    private int electroCardioGram;
    private int maxElectroCardioGram;
    private int pulseOximetry;
    private int maxPulseOximetry;
    private int position;
    private Problem currentProblem;

    public PatientMonitoring(int position, int maxBloodPressure, int maxElectroCardioGram, int maxPulseOximetry) {
        this.observers = new ArrayList<Observer>();
        this.position = position;
        this.maxBloodPressure = maxBloodPressure;
        this.maxElectroCardioGram = maxElectroCardioGram;
        this.maxPulseOximetry = maxPulseOximetry;
        this.currentProblem = Problem.noProblem;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update(position, currentProblem, bloodPressure, electroCardioGram, pulseOximetry);
        }
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
        if (bloodPressure > maxBloodPressure) {
            this.currentProblem = Problem.bloodPressure;
            notifyObservers();
        }
    }

    public void setElectroCardioGram(int electroCardioGram) {
        this.electroCardioGram = electroCardioGram;
        if (electroCardioGram > maxElectroCardioGram) {
            this.currentProblem = Problem.ECG;
            notifyObservers();
        }
    }


    public void setPulseOximetry(int pulseOximetry) {
        this.pulseOximetry = pulseOximetry;
        if (pulseOximetry > maxPulseOximetry) {
            this.currentProblem = Problem.oximetry;
            notifyObservers();
        }
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
