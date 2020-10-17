package ch.hevs.design_patterns.lab6_singleton_pattern.sensors;

/**
 * Lab 6
 * @author scz
 */
public class SpeedSensor implements ISensor {
    
    private static final String DESC = "Speed sensor is running...";
    
    public SpeedSensor() {
    }

    public String getDescription() {
        return DESC;
    }

    public String toString() {
        return this.getDescription();
    }
}
