package ch.hevs.design_patterns.lab7_command_pattern_ex1;

import ch.hevs.design_patterns.lab7_command_pattern_ex1.commands.BackwardCommand;
import ch.hevs.design_patterns.lab7_command_pattern_ex1.commands.ForwardCommand;
import ch.hevs.design_patterns.lab7_command_pattern_ex1.commands.LeftCommand;
import ch.hevs.design_patterns.lab7_command_pattern_ex1.commands.RightCommand;
import ch.hevs.design_patterns.lab7_command_pattern_ex1.invoker.Game;
import ch.hevs.design_patterns.lab7_command_pattern_ex1.receiver.Car;

/**
 * Lab 7
 * @author scz
 */
public class MobilePhone {

	public static void main(String[] args) {
		Game game = new Game();
		Car car = new Car();
		game.setCommand(0, new ForwardCommand(car));
		game.setCommand(1, new BackwardCommand(car));
		game.setCommand(2, new RightCommand(car));
		game.setCommand(3, new LeftCommand(car));
		
		game.pushKey(2);
		game.pushKey(2);
		game.pushKey(3);
		game.pushKey(2);
		game.pushKey(0);
		game.pushKey(1);
		game.undo();
	}

}
