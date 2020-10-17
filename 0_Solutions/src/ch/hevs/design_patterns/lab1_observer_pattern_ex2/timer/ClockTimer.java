package ch.hevs.design_patterns.lab1_observer_pattern_ex2.timer;

public interface ClockTimer {
    int getHour();
    int getMinute();
    int getSecond();
    void tick();
}