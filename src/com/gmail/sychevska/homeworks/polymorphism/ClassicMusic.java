package com.gmail.sychevska.homeworks.polymorphism;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String band) {
        this.band = band;
    }

    @Override
    public void playMusic() {
        System.out.println("Classic music band: " + band);
    }
}
