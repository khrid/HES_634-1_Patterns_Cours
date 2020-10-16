package ex2_conversation.states;

public interface State {
    void connect();
    void leave();
    void enter();
    void over();
    void ask();
    void handOver();
}
