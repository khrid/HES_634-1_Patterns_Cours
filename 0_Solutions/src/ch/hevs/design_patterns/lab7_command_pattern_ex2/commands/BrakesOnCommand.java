package ch.hevs.design_patterns.lab7_command_pattern_ex2.commands;

import ch.hevs.design_patterns.lab7_command_pattern_ex2.Log;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.Brakes;

/**
 * Lab 7
 * @author scz
 */
public class BrakesOnCommand implements Command {

	Brakes brakes;

	public BrakesOnCommand(Brakes brakes) {
		this.brakes = brakes;
	}

	public void execute() {
		brakes.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
