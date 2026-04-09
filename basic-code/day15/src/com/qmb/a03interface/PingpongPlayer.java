package com.qmb.a03interface;

public class PingpongPlayer extends Player implements SpeackEnglish{

    public PingpongPlayer(){}

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
