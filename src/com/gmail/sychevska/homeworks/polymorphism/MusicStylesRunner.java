package com.gmail.sychevska.homeworks.polymorphism;

public class MusicStylesRunner {
    public static void main(String[] args) {
        MusicStyles[] bands = {
                new PopMusic("Backstreet Boys"),
                new RockMusic("Nirvana"),
                new ClassicMusic("Toronto Symphony Orchestra")
        };
        for (MusicStyles band : bands) {
            band.playMusic();
        }

    }
}
