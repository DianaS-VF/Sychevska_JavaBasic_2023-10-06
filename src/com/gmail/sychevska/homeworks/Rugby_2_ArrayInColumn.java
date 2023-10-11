package com.gmail.sychevska.homeworks;

import java.util.Random;

public class Rugby_2_ArrayInColumn {
    public static void main(String[] args) {

        int numberOfPlayersInTeam = 25;
        int[] array = new int[numberOfPlayersInTeam];
        int minValue = 18;
        int maxValue = 40;
        String firstTeamName = "Bulls";
        String secondTeamName = "Lions";

        Random random = new Random();


        System.out.println("Age of players of \"" + firstTeamName + "\": ");
        for (int i = 0; i < numberOfPlayersInTeam; i++) {
            System.out.println("Player" + " " + (i + 1) + " - " + random.nextInt(minValue, maxValue + 1) + " years");
        }

        System.out.println();
        System.out.println();

        System.out.println("Age of players of \"" + secondTeamName + "\": ");
        for (int i = 0; i < numberOfPlayersInTeam; i++) {
            System.out.println("Player" + " " + (i + 1) + " - " + random.nextInt(minValue, maxValue + 1) + " years");
        }
    }
}