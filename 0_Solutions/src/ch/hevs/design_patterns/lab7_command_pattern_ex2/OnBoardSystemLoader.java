package ch.hevs.design_patterns.lab7_command_pattern_ex2;


import ch.hevs.design_patterns.lab7_command_pattern_ex2.commands.*;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.invoker.*;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.*;

/**
 * Lab 7
 * @author scz
 */
public class OnBoardSystemLoader {
 
	public static void main(String[] args) {
        OnBoardSystemLoader launcher = new OnBoardSystemLoader();
        OnBoardSystem onBoardSystem = launcher.setupOnBoardSystem();
        launcher.test(onBoardSystem);
    }

    public void test(OnBoardSystem onBoardSystem) {
		
		System.out.println(onBoardSystem);
 
		//Acceleration
		onBoardSystem.onButtonWasPushed(5);
		onBoardSystem.onButtonWasPushed(0);
		onBoardSystem.offButtonWasPushed(0);
		onBoardSystem.onButtonWasPushed(5);
		
		//Turn right
		onBoardSystem.offButtonWasPushed(5);
		onBoardSystem.onButtonWasPushed(4);
		onBoardSystem.onButtonWasPushed(6);
		onBoardSystem.offButtonWasPushed(6);
		onBoardSystem.offButtonWasPushed(4);
		
		//Small lights
		onBoardSystem.onButtonWasPushed(1);
		onBoardSystem.onButtonWasPushed(2);
		onBoardSystem.offButtonWasPushed(2);
		
		//We break
		onBoardSystem.onButtonWasPushed(6);
		
	}

    public OnBoardSystem setupOnBoardSystem() {
        OnBoardSystem onBoardSystem = new OnBoardSystem();

		Clutch clutch = new Clutch();
		ClutchOffCommand ClutchOffCommand = new ClutchOffCommand(clutch);
		ClutchOnCommand ClutchOnCommand = new ClutchOnCommand(clutch);

		ShortLights shortLights = new ShortLights();
		ShortLightsOffCommand shortLightsOffCommand = new ShortLightsOffCommand(shortLights);
		ShortLightsOnCommand shortLightsOnCommand = new ShortLightsOnCommand(shortLights);

		LongLights longLights = new LongLights();
		LongLightsOffCommand longLightsOffCommand = new LongLightsOffCommand(longLights);
		LongLightsOnCommand longLightsOnCommand = new LongLightsOnCommand(longLights);

		LeftIndicator leftIndicator = new LeftIndicator();
		LeftIndicatorOffCommand leftIndicatorOffCommand = new LeftIndicatorOffCommand(leftIndicator);
		LeftIndicatorOnCommand leftIndicatorOnCommand = new LeftIndicatorOnCommand(leftIndicator);

        RightIndicator rightIndicator = new RightIndicator();
		RightIndicatorOffCommand rightIndicatorOffCommand = new RightIndicatorOffCommand(rightIndicator);
		RightIndicatorOnCommand rightIndicatorOnCommand = new RightIndicatorOnCommand(rightIndicator);

		SpeedControl speedControl = new SpeedControl();
		SpeedControlOffCommand speedControlOffCommand = new SpeedControlOffCommand(speedControl);
		SpeedControlOnCommand speedControlOnCommand = new SpeedControlOnCommand(speedControl);

		Brakes brakes = new Brakes();
		BrakesOffCommand brakesOffCommand = new BrakesOffCommand(brakes);
		BrakesOnCommand brakesOnCommand = new BrakesOnCommand(brakes);

		onBoardSystem.setCommand(0, ClutchOnCommand, ClutchOffCommand);
		onBoardSystem.setCommand(1, shortLightsOnCommand, shortLightsOffCommand);
		onBoardSystem.setCommand(2, longLightsOnCommand, longLightsOffCommand);
		onBoardSystem.setCommand(3, leftIndicatorOnCommand, leftIndicatorOffCommand);
		onBoardSystem.setCommand(4, rightIndicatorOnCommand, rightIndicatorOffCommand);
		onBoardSystem.setCommand(5, speedControlOnCommand, speedControlOffCommand);
		onBoardSystem.setCommand(6, brakesOnCommand, brakesOffCommand);

        return onBoardSystem;
    }
}
