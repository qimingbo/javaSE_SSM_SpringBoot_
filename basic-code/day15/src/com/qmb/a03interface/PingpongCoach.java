package com.qmb.a03interface;

public class PingpongCoach extends Coach implements SpeackEnglish {

    public PingpongCoach(){
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
