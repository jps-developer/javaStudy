package oop;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String str) {
        System.out.println("메일 발송합니다. " + str);
    }
}
