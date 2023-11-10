package com.gmail.sychevska.homeworks.polymorphism;

public class PopMusic extends MusicStyles {
    public PopMusic(String band) {
        this.band = band;
    }

    @Override
    public void playMusic() {
        System.out.println("Pop music band: " + band);
    }
}
