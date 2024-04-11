package oop;

public class SnsSender implements Sender{
    @Override
    public void sendMessage(String str) {
        System.out.println("SNS 메일환영합니다. " + str);
    }
}
