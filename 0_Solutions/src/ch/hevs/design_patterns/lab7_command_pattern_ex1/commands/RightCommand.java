package ch.hevs.design_patterns.lab7_command_pattern_ex1.commands;

import ch.hevs.design_patterns.lab7_command_pattern_ex1.receiver.Car;

/**
 * Lab 7
 * @author scz
 */
public class RightCommand implements Command {
	
	public RightCommand(Car car) {
		this.myCar = car;
	}
	
	public void execute() {
		myCar.right();
	}

	public void undo() {
		myCar.left();
	}

	private Car myCar;

}
