package ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver;

/**
 * Lab 7
 * @author scz
 */
public class Brakes {
	
	public void on() {
		System.out.println("The car brakes...");
	}

	public void off() {
		System.out.println("Stop braking.");
	}
}
