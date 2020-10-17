package ch.hevs.design_patterns.lab7_command_pattern_ex1.invoker;

import ch.hevs.design_patterns.lab7_command_pattern_ex1.commands.Command;

/**
 * Lab 7
 * @author scz
 */
public class Game {
	
	public void pushKey(int key) {
		myCommands[key].execute();
		undoCommand = myCommands[key];
	}

	public void undo(){
		undoCommand.undo();
	}

	public void setCommand(int key, Command command){
		myCommands[key] = command;
	}

	private Command undoCommand;
	private Command[] myCommands = new Command[4];;
	
}
