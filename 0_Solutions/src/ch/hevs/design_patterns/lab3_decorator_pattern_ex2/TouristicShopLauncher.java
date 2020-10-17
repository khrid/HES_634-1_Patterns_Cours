package ch.hevs.design_patterns.lab3_decorator_pattern_ex2;

import ch.hevs.design_patterns.lab3_decorator_pattern_ex2.component.Montana;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex2.component.Stay;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex2.component.Verbier;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex2.decorator.HotelRoom;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex2.decorator.SkiPass;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex2.decorator.Wellness;

public class TouristicShopLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stay verbier = new Verbier();
		verbier = new SkiPass(verbier);
		verbier = new HotelRoom(verbier);
		
		displayStay(verbier);
		
		Stay montana = new Montana();
		montana = new Wellness(montana);
		montana = new SkiPass(montana);
		montana = new SkiPass(montana);
		
		displayStay(montana);

	}
	
	public static void displayStay(Stay stay){
		System.out.println("Package stay : " + stay.getDescription());
		System.out.println("Cost : " + stay.getCost() + "\n");
	}
	
	

}
