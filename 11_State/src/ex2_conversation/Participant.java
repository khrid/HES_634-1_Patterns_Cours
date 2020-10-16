package ex2_conversation;

import ex2_conversation.states.*;

public class Participant {
    private State state;
    private State inMeetingState, registeredState, speakingState, waitingToSpeakState;

    public Participant() {
        inMeetingState = new InMeetingState(this);
        registeredState = new RegisteredState(this);
        speakingState = new SpeakingState(this);
        waitingToSpeakState = new WaitingToSpeakState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getInMeetingState() {
        return inMeetingState;
    }

    public State getRegisteredState() {
        return registeredState;
    }

    public State getSpeakingState() {
        return speakingState;
    }

    public State getWaitingToSpeakState() {
        return waitingToSpeakState;
    }

    public void connect() {
        System.out.println("Connecting to meeting...");
        setState(getRegisteredState());
    }

    public void enter() {
        state.enter();
    }

    public void ask() {
        state.ask();
    }

    public void handOver() {
        state.handOver();
    }

    public void over() {
        state.over();
    }

    public void leave() {
        state.leave();
    }
}
