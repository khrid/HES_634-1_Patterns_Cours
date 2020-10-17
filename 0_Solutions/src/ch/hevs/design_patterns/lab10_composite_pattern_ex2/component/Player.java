package ch.hevs.design_patterns.lab10_ex2.component;

/**
 * Lab 10
 * @author scz
 */
public class Player implements Playable {

	private final int name;
	
	public Player(int name) {
		this.name = name;
	}

	public void cry() {
		System.out.println(name + " is crying");
	}

	public void enterField() {
		System.out.println(name + " is entering field");
	}

	public void shoot() {
		System.out.println(name + " is shooting");		
	}

	public void simulateInjury() {
		System.out.println(name + " is simulating an Injury");
	}
}
