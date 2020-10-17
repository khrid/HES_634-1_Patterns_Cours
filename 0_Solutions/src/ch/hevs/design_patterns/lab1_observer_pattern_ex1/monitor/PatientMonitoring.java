package ch.hevs.design_patterns.lab1_observer_pattern_ex1.monitor;

import ch.hevs.design_patterns.lab1_observer_pattern_ex1.observer.Observer;
import ch.hevs.design_patterns.lab1_observer_pattern_ex1.observer.Problem;
import ch.hevs.design_patterns.lab1_observer_pattern_ex1.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  scz
 */
public class PatientMonitoring implements Subject {

	private List<Observer> observers;

    private int bloodPressure;
    private int maxBloodPressure;
    private int electroCardioGram;
    private int maxElectroCardioGram;
    private int pulseOximetry;
    private int maxPulseOximetry;
    private int position; // room number
    private Problem currentProblem;

    public PatientMonitoring(int startingPosition, int maxBloodPressure, int maxElectroCardioGram, int maxPulseOximetry) {
        observers = new ArrayList<Observer>();
        this.maxBloodPressure = maxBloodPressure;
        this.maxElectroCardioGram = maxElectroCardioGram;
        this.maxPulseOximetry = maxPulseOximetry;
        this.position = startingPosition;
        this.currentProblem = Problem.NO_PROBLEM;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for (Observer o : observers)
            o.update(this.position, this.currentProblem, this.bloodPressure, this.electroCardioGram, this.pulseOximetry);
    }

    public void setBloodPressure(int newBloodPressure) {
		this.bloodPressure = newBloodPressure;
		if (newBloodPressure > maxBloodPressure) {
			this.currentProblem = Problem.BLOOD_PRESSURE;
			notifyObservers();
		}
	}

    public void setElectroCardioGram(int newElectroCardioGram) {
		this.electroCardioGram = newElectroCardioGram;
		if (newElectroCardioGram > maxElectroCardioGram) {
			this.currentProblem = Problem.ECG;
			notifyObservers();
		}
	}

    public void setPulseOximetry(int newPulseOximetry) {
		this.pulseOximetry = newPulseOximetry;
		if (newPulseOximetry > maxPulseOximetry) {
			this.currentProblem = Problem.OXIMETRY;
			notifyObservers();
		}
	}

    public void setPosition(int position) {
		this.position = position;
	}


}
