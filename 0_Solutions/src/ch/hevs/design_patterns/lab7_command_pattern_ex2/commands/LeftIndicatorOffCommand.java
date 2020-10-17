package ch.hevs.design_patterns.lab7_command_pattern_ex2.commands;

import ch.hevs.design_patterns.lab7_command_pattern_ex2.Log;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.LeftIndicator;

/**
 * Lab 7
 * @author scz
 */
public class LeftIndicatorOffCommand implements Command {

	LeftIndicator leftIndicator;
	
	public LeftIndicatorOffCommand(LeftIndicator leftIndicator) {
		this.leftIndicator = leftIndicator;
	}

	public void execute() {
		leftIndicator.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
