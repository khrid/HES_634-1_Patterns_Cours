package ch.hevs.design_patterns.lab7_command_pattern_ex2.commands;


import ch.hevs.design_patterns.lab7_command_pattern_ex2.Log;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.SpeedControl;

/**
 * Lab 7
 * @author scz
 */
public class SpeedControlOffCommand implements Command {

	SpeedControl speedControl;
	
	public SpeedControlOffCommand(SpeedControl speedControl) {
		this.speedControl = speedControl;
	}

	public void execute() {
		speedControl.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
