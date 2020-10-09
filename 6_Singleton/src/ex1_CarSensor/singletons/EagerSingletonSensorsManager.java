package ex1_CarSensor.singletons;

import ex1_CarSensor.singletons.SimpleSingletonSensorsManager;

public class EagerSingletonSensorsManager extends SimpleSingletonSensorsManager {
    private static EagerSingletonSensorsManager instance = new EagerSingletonSensorsManager();

    public static SingletonSensorManager getInstance() {
        return instance;
    }
}
