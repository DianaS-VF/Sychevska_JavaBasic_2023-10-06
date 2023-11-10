package com.gmail.sychevska.homeworks.polymorphism;

public class RockMusic extends MusicStyles {
    public RockMusic(String band) {
        this.band = band;
    }

    @Override
    public void playMusic() {
        System.out.println("Rock music band: " + band);
    }
}
