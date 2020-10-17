package ch.hevs.design_patterns.lab6_singleton_pattern.sensor_manager;


import ch.hevs.design_patterns.lab6_singleton_pattern.sensors.ISensor;

import java.util.Collection;
import java.util.HashMap;

/**
 * Lab 6
 * @author scz
 */
public abstract class SingletonSensorManager {

    protected HashMap<String, ISensor> sensors = null;

    protected SingletonSensorManager() {
        this.sensors = new HashMap<>();
    }

    public void addSensor(ISensor sensor) {
        this.sensors.put(sensor.getClass().getName(), sensor);
    }

    public void printState() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().toString()).append('\n');
        Collection<ISensor> sensorsList = this.sensors.values();
        for (ISensor sensor : sensorsList) {
            sb.append(" - ").append(sensor).append('\n');
        }
        System.out.println(sb.toString());
    }


}
