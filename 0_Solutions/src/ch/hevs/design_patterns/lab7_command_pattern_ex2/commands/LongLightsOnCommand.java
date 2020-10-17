package ch.hevs.design_patterns.lab7_command_pattern_ex2.commands;


import ch.hevs.design_patterns.lab7_command_pattern_ex2.Log;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.LongLights;

/**
 * Lab 7
 * @author scz
 */
public class LongLightsOnCommand implements Command {

	LongLights longLights;

	public LongLightsOnCommand(LongLights longLights) {
		this.longLights = longLights;
	}

	public void execute() {
		longLights.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
