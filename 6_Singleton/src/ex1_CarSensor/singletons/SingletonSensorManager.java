package ex1_CarSensor.singletons;

import ex1_CarSensor.sensors.Sensor;

import java.util.ArrayList;
import java.util.List;

public abstract class SingletonSensorManager {
    List<Sensor> sensors = new ArrayList<>();

    public void printState() {
        System.out.println("I have " + sensors.size()+" sensors : ");
        for (Sensor s :
                sensors) {
            System.out.println(s);
        }
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    static SingletonSensorManager getInstance() {
        return null;
    }
}
