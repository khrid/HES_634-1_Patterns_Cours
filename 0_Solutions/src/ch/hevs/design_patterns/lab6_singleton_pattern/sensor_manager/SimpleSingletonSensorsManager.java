package ch.hevs.design_patterns.lab6_singleton_pattern.sensor_manager;

/**
 * Lab 6
 * @author scz
 */
public class SimpleSingletonSensorsManager extends SingletonSensorManager {

    private static SingletonSensorManager instance;
    
    private SimpleSingletonSensorsManager() {
    	super();
    }

    public static SingletonSensorManager getInstance() {
        if (instance == null) {
            instance = new SimpleSingletonSensorsManager();
        }
        return instance;
    }
}
