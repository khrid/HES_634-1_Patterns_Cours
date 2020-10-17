package ch.hevs.design_patterns.lab1_observer_pattern_ex2.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
