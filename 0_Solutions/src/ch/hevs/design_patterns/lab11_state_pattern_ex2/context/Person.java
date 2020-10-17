package ch.hevs.design_patterns.lab11_state_pattern_ex2.context;

import ch.hevs.design_patterns.lab11_state_pattern_ex2.state.*;

/**
 * Lab 11
 * @author scz
 */
public class Person {

	private State registeredState = new Registered(this);
	private State inMeetingState = new InMeeting(this);
	private State speakingState = new Speaking(this);
	private State waitingToSpeakState = new WaitingToSpeak(this);
	private State state = registeredState;
	
	public void enter() {
		state = state.enter();
	}
	
	public void leave() {
		state = state.leave();
	}
	
	public void ask() {
		state = state.ask();
	}
	
	public void handOver(){
		state = state.handover();
	}
	
	public void over(){
		state = state.over();
	}	
	
	public State getRegisteredState() {
		return registeredState;
	}

	public State getInMeetingState() {
		return inMeetingState;
	}

	public State getSpeakingState() {
		return speakingState;
	}

	public State getWaitingToSpeakState() {
		return waitingToSpeakState;
	}
}
