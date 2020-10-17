package ch.hevs.design_patterns.lab6_singleton_pattern.sensor_manager;

/**
 * Lab 6
 * @author scz
 */
public class SynchSingletonSensorsManager extends SingletonSensorManager {

    private static SingletonSensorManager instance;
    
    private SynchSingletonSensorsManager() {
    	super();
    }

    public static synchronized SingletonSensorManager getInstance() {
        if (instance == null) {
            instance = new SynchSingletonSensorsManager();
        }
        return instance;
    }
}
