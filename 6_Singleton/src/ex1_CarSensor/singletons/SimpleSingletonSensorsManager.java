package ex1_CarSensor.singletons;

public class SimpleSingletonSensorsManager extends SingletonSensorManager {
    private static SimpleSingletonSensorsManager instance;

    public static SingletonSensorManager getInstance() {
        if(instance == null) {
            instance = new SimpleSingletonSensorsManager();
        }
        return instance;
    }
}
