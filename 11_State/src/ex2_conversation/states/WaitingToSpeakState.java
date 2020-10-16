package ex2_conversation.states;

import ex2_conversation.Participant;

public class WaitingToSpeakState implements State {
    Participant p;
    public WaitingToSpeakState(Participant p) {
        this.p = p;
    }

    @Override
    public void connect() {
        System.out.println("Already connected");
    }

    @Override
    public void leave() {
        System.out.println("Leaving meeting");
        p.setState(p.getRegisteredState());
    }

    @Override
    public void enter() {
        System.out.println("Already in a meeting");
    }

    @Override
    public void over() {
        System.out.println("Not speaking");
    }

    @Override
    public void ask() {
        System.out.println("Already waiting to speak");
    }

    @Override
    public void handOver() {
        System.out.println("Starting to speak");
        p.setState(p.getSpeakingState());
    }
}
