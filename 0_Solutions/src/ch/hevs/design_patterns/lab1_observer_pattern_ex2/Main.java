package ch.hevs.design_patterns.lab1_observer_pattern_ex2;


import ch.hevs.design_patterns.lab1_observer_pattern_ex2.clock.*;
import ch.hevs.design_patterns.lab1_observer_pattern_ex2.timer.*;

public class Main {


    public static void main(String[] args) {
        MyTimer clockTimer = new MyTimer();

        new AnalogClock(clockTimer);
        new DigitalClock(clockTimer);
    }
}