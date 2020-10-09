package ex1_CarSensor.singletons;

public class SynchSingletonSensorsManager extends SingletonSensorManager {
    private static SynchSingletonSensorsManager instance;

    public static synchronized  SingletonSensorManager getInstance() {
        if(instance == null) {
            instance = new SynchSingletonSensorsManager();
        }
        return instance;
    }
}
