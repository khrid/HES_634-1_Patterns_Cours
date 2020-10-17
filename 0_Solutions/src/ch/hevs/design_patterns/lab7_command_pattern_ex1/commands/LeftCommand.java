package ch.hevs.design_patterns.lab7_command_pattern_ex1.commands;

import ch.hevs.design_patterns.lab7_command_pattern_ex1.receiver.Car;

/**
 * Lab 7
 * @author scz
 */
public class LeftCommand implements Command {

	public LeftCommand(Car car) {
		this.myCar = car;
	}

	public void execute() {
		myCar.left();
	}

	public void undo() {
		myCar.right();
	}

	private Car myCar;

}
