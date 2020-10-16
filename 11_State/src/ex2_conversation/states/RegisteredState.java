package ex2_conversation.states;

import ex2_conversation.Participant;

public class RegisteredState implements State {
    Participant p;
    public RegisteredState(Participant p) {
        this.p = p;
    }

    @Override
    public void connect() {
        System.out.println("Already connected");
    }

    @Override
    public void leave() {
        System.out.println("Not in a meeting, can't leave");
    }

    @Override
    public void enter() {
        System.out.println("Entering the meeting now");
        p.setState(p.getInMeetingState());
    }

    @Override
    public void over() {
        System.out.println("Not in a meeting");
    }

    @Override
    public void ask() {
        System.out.println("Not in a meeting");
    }

    @Override
    public void handOver() {
        System.out.println("Not in a meeting");
    }
}
