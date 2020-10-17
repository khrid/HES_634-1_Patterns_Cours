package ch.hevs.design_patterns.lab7_command_pattern_ex2.commands;

import ch.hevs.design_patterns.lab7_command_pattern_ex2.Log;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.Brakes;

/**
 * Lab 7
 * @author scz
 */
public class BrakesOffCommand implements Command {

	Brakes brakes;
	
	public BrakesOffCommand(Brakes brakes) {
		this.brakes = brakes;
	}

	public void execute() {
		brakes.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
