package ex1_CarSensor.singletons;

import ex1_CarSensor.singletons.SimpleSingletonSensorsManager;

public class DbleCheckedLockingSingletonSensorsManager extends SimpleSingletonSensorsManager {
    private volatile static DbleCheckedLockingSingletonSensorsManager instance;

    public static SingletonSensorManager getInstance() {
        if(instance == null) {
            synchronized (DbleCheckedLockingSingletonSensorsManager.class) {
                if(instance == null) {
                    instance = new DbleCheckedLockingSingletonSensorsManager();
                }
            }
        }
        return instance;
    }
}
