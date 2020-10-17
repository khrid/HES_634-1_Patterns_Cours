package ch.hevs.design_patterns.lab7_command_pattern_ex2.commands;

import ch.hevs.design_patterns.lab7_command_pattern_ex2.Log;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.Clutch;

/**
 * Lab 7
 * @author scz
 */
public class ClutchOffCommand implements Command {

	Clutch clutch;
	
	public ClutchOffCommand(Clutch clutch) {
		this.clutch = clutch;
	}

	public void execute() {
		clutch.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
