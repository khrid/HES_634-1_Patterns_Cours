package ex1_CarSensor;

import ex1_CarSensor.sensors.*;
import ex1_CarSensor.singletons.*;

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