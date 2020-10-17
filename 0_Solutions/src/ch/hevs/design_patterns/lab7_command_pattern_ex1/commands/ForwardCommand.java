package ch.hevs.design_patterns.lab7_command_pattern_ex1.commands;

import ch.hevs.design_patterns.lab7_command_pattern_ex1.receiver.Car;

/**
 * Lab 7
 * @author scz
 */
public class ForwardCommand implements Command {
	
	public ForwardCommand(Car car) {
		this.myCar = car;
	}

	public void execute() {
		myCar.forward();
	}

	public void undo() {
		myCar.backward();
	}

	private Car myCar;

}
