package ex2_conversation.states;

import ex2_conversation.Participant;

public class SpeakingState implements State {
    Participant p;
    public SpeakingState(Participant p) {
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
        System.out.println("Already speaking in a meeting");
    }

    @Override
    public void over() {
        System.out.println("Finished speaking");
        p.setState(p.getInMeetingState());
    }

    @Override
    public void ask() {
        System.out.println("Already speaking");
    }

    @Override
    public void handOver() {
        System.out.println("Already speaking");
    }
}
