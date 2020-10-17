package ch.hevs.design_patterns.lab7_command_pattern_ex1.receiver;

/**
 * Lab 7
 * @author scz
 */
public class Car {

	public void forward(){
		System.out.println("Car goes forward");
	}
	public void backward() {
		System.out.println("Car goes backward");
	}
	public void left(){
		System.out.println("Car goes left");		
	}
	public void right(){
		System.out.println("Car goes right");		
	}
}
