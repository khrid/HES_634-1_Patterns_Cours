package ch.hevs.design_patterns.lab7_command_pattern_ex1.commands;

import ch.hevs.design_patterns.lab7_command_pattern_ex1.receiver.Car;

/**
 * Lab 7
 * @author scz
 */
public class BackwardCommand implements Command {
	
	public BackwardCommand(Car car) {
		this.myCar = car;
	}

	public void execute() {
		myCar.backward();
	}

	public void undo() {
		myCar.forward();
	}

	private Car myCar;

}
