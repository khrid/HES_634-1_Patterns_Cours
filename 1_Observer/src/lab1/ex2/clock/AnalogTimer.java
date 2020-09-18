package lab1.ex2.clock;

import lab1.ex2.observer.Observer;
import lab1.ex2.timer.ClockTimer;
import lab1.ex2.timer.MyTimer;

public class AnalogTimer implements Observer {
    public AnalogTimer(ClockTimer clockTimer) {
        clockTimer.registerObserver(this);
    }

    @Override
    public void update(int h, int m, int s) {

    }
}
