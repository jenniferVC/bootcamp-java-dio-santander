package main.iphone;

import main.Smartphone;

public class Iphone implements Smartphone {
    private String model;
    private String storage;



    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Call answered.");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voicemail");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocked iPhone.");
    }
}
