package ch.hevs.design_patterns.lab6_singleton_pattern.sensor_manager;

/**
 * Lab 6
 * @author scz
 */
public class EagerSingletonSensorsManager extends SingletonSensorManager {

    private static SingletonSensorManager instance = new EagerSingletonSensorsManager();
    
    private EagerSingletonSensorsManager() {
    	super();
    }

    public static SingletonSensorManager getInstance() {
        return instance;
    }
}
