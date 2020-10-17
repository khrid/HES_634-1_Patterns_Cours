package ch.hevs.design_patterns.lab11_state_pattern_ex2.state;

import ch.hevs.design_patterns.lab11_state_pattern_ex2.context.Person;

/**
 * Lab 11
 * @author scz
 */
public class WaitingToSpeak implements State {

	private Person person;
	
	public WaitingToSpeak(Person person) {
		this.person = person;
	}
	
	public State ask() {
		return this;
	}

	public State enter() {
		return this;
	}

	public State handover() {
		System.out.println("Handover");
		return person.getSpeakingState();
	}

	public State leave() {
		System.out.println("Leave");
		return person.getRegisteredState();
	}

	public State over() {
		return this;
	}
}
