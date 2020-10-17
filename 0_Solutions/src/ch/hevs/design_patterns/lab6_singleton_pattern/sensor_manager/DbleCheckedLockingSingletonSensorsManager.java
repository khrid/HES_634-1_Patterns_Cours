package ch.hevs.design_patterns.lab6_singleton_pattern.sensor_manager;


/**
 * Lab 6
 * @author scz
 */
public class DbleCheckedLockingSingletonSensorsManager extends SingletonSensorManager {

    private static SingletonSensorManager instance;
    
    private DbleCheckedLockingSingletonSensorsManager() {
    	super();
    }

    public static SingletonSensorManager getInstance() {
        if (instance == null) {
            synchronized (DbleCheckedLockingSingletonSensorsManager.class) {
                if (instance == null) {
                    instance = new DbleCheckedLockingSingletonSensorsManager();
                }
            }
        }
        return instance;
    }

}
