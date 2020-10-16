package ex2_conversation.states;

import ex2_conversation.Participant;

public class InMeetingState implements State {
    Participant p;
    public InMeetingState(Participant p) {
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
        System.out.println("Need to ask to speak first");
    }

    @Override
    public void ask() {
        System.out.println("Asking to speak");
        p.setState(p.getWaitingToSpeakState());
    }

    @Override
    public void handOver() {
        System.out.println("Not in queue to speak");
    }
}
