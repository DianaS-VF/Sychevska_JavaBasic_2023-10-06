package com.gmail.sychevska.homeworks;


import java.util.Random;

public class Rugby_1 {
    public static void main(String[] args) {

        int playersNumber = 25;
        int[] array = new int[playersNumber];
        int minValue = 18;
        int maxValue = 40;
        String firstTeamName = "Bulls";
        String secondTeamName = "Lions";

        Random random = new Random();


        System.out.println("Age of players of \"" + firstTeamName + "\": ");
        for (int i = 0; i < playersNumber; i++) {
            System.out.print(random.nextInt(minValue, maxValue + 1) + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Age of players of \"" + secondTeamName + "\": ");
        for (int i = 0; i < playersNumber; i++) {
            System.out.print(random.nextInt(minValue, maxValue + 1) + " ");
        }

    }

}
