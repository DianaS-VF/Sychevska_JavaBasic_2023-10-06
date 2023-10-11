package com.gmail.sychevska.homeworks;

import java.util.concurrent.ThreadLocalRandom;

public class RugbyAverageAge {
    public static void main(String[] args) {
        int teamSize = 25;
        String firstTeamName = "Chicago Bulls";
        String secondTeamName = "LA Lions";

        int[] firstTeamAges = generatePlayersAges(teamSize);
        int[] secondTeamAges = generatePlayersAges(teamSize);

        System.out.println("Age of players of \"" + firstTeamName + "\": ");
        displayPlayersAges(firstTeamAges);
        double firstTeamAverageAge = calculateAverageAge(firstTeamAges);
        System.out.printf("Average age of \"%s\" = %.2f\n", firstTeamName, firstTeamAverageAge);
        System.out.println();

        System.out.println("Age of players of \"" + secondTeamName + "\": ");
        displayPlayersAges(secondTeamAges);
        double secondTeamAverageAge = calculateAverageAge(secondTeamAges);
        System.out.printf("Average age of \"%s\" = %.2f\n", secondTeamName, secondTeamAverageAge);
    }

    public static int[] generatePlayersAges(int teamSize) {
        int[] ages = new int[teamSize];
        int ageMinValue = 18;
        int ageMaxValue = 40;
        for (int i = 0; i < ages.length; i++) {
            ages[i] = ThreadLocalRandom.current().nextInt(ageMinValue, ageMaxValue + 1);
        }
        return ages;
    }

    public static void displayPlayersAges(int[] allAges) {
        for (int playerAge : allAges) {
            System.out.print(playerAge + " ");
        }
        System.out.println();
    }

    public static double calculateAverageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return sum / (double) ages.length;
    }
}
