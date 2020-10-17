package ch.hevs.design_patterns.lab6_singleton_pattern;


import ch.hevs.design_patterns.lab6_singleton_pattern.sensor_manager.*;
import ch.hevs.design_patterns.lab6_singleton_pattern.sensors.*;

/**
 * Lab 6
 * @author scz
 */
public class CarSensorSingletonLauncher {
    
    public CarSensorSingletonLauncher() {
    }
    
    public static void main(String[] args) {
        CarSensorSingletonLauncher launcher
                = new CarSensorSingletonLauncher();
        launcher.launch();
    }
    
    public void launch() {
        this.test(SimpleSingletonSensorsManager.getInstance());
        this.test(SynchSingletonSensorsManager.getInstance());
        this.test(EagerSingletonSensorsManager.getInstance());
        this.test(DbleCheckedLockingSingletonSensorsManager.getInstance());
    }

    private void test(SingletonSensorManager manager) {
        manager.addSensor(new TemperatureSensor());
        manager.addSensor(new SpeedSensor());
        manager.addSensor(new RoadConditionSensor());
        manager.printState();
    }
}
