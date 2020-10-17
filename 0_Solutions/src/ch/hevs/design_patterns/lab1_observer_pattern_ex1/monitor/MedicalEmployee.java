package ch.hevs.design_patterns.lab1_observer_pattern_ex1.monitor;

import ch.hevs.design_patterns.lab1_observer_pattern_ex1.observer.Observer;
import ch.hevs.design_patterns.lab1_observer_pattern_ex1.observer.Problem;
import ch.hevs.design_patterns.lab1_observer_pattern_ex1.observer.Subject;

/**
 * @author  scz
 */
public class MedicalEmployee implements Observer {

    private String name;

    public MedicalEmployee(String name, Subject subject) {
        this.name = name;
        subject.registerObserver(this);
    }

    public void update(int position, Problem p, int bloodPressure , int electroCardioGram, int pulseOximetry) {
        System.out.print("Employee " + name + " receives notification: ");
        System.out.println("Position " + position + " observer.Problem " + p + " BloodPressure " + bloodPressure + " ElectroCardioGram " + electroCardioGram + " PulseOximetry " + pulseOximetry);
    }


}
