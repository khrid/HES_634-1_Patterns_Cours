package ch.hevs.design_patterns.lab7_command_pattern_ex2.commands;


import ch.hevs.design_patterns.lab7_command_pattern_ex2.Log;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.ShortLights;

/**
 * Lab 7
 * @author scz
 */
public class ShortLightsOnCommand implements Command {

	ShortLights shortLights;

	public ShortLightsOnCommand(ShortLights shortLights) {
		this.shortLights = shortLights;
	}

	public void execute() {
		shortLights.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
