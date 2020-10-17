package ch.hevs.design_patterns.lab10_ex2.composite;

import ch.hevs.design_patterns.lab10_ex2.component.Playable;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 10
 * @author scz
 */
public class Team implements Playable {

	public void add(Playable p) {
		myPlayers.add(p);
	}
	
	public void remove(Playable p) {
		myPlayers.remove(p);
	}
	
	public void cry() {
		for (Playable p : myPlayers) 
			p.cry();
	}

	public void enterField() {
		for (Playable p : myPlayers) 
			p.enterField();
	}

	public void shoot() {
		for (Playable p : myPlayers) 
			p.shoot();
	}

	public void simulateInjury() {
		for (Playable p : myPlayers) 
			p.simulateInjury();
	}

	private final List<Playable> myPlayers = new ArrayList<Playable>();
}
