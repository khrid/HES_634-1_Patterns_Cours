package ch.hevs.design_patterns.lab1_observer_pattern_ex1.observer;

/**
 *
 * @author scz
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
