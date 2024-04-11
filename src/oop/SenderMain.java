package oop;

public class SenderMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SnsSender()};

        for (Sender sender : senders) {
            sender.sendMessage("hello~~~");
        }
    }
}
