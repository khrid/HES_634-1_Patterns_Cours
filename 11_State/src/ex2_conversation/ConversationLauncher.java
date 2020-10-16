package ex2_conversation;

public class ConversationLauncher {
    public static void main(String[] args) {

        Participant p = new Participant();
        p.connect();
        p.enter();
        p.ask();
        p.handOver();
        p.over();
        p.leave();

        Participant rude = new Participant();
        rude.connect();
        rude.enter();
        rude.handOver();
        rude.handOver();
        rude.leave();
    }
}
