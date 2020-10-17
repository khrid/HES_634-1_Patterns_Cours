package ch.hevs.design_patterns.lab11_state_pattern_ex2.state;

import ch.hevs.design_patterns.lab11_state_pattern_ex2.context.Person;

/**
 * Lab 11
 * @author scz
 */
public class Speaking implements State {

	private Person person;
	
	public Speaking(Person person) {
		this.person = person;
	}
	
	public State ask() {
		return this;
	}

	public State enter() {
		return this;
	}

	public State handover() {
		return this;
	}

	public State leave() {
		System.out.println("leave");
		return person.getRegisteredState();
	}

	public State over() {
		System.out.println("over");
		return person.getInMeetingState();
	}
}
