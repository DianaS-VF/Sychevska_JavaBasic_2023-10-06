package com.gmail.sychevska.homeworks;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Team1

        System.out.print("Enter the name of the Police team: ");
        String policeTeamName = scanner.nextLine();

        System.out.print("Enter frag number for Player #1: ");
        int policeFirstPlayer = scanner.nextInt();

        System.out.print("Enter frag number for Player #2: ");
        int policeSecondPlayer = scanner.nextInt();

        System.out.print("Enter frag number for Player #3: ");
        int policeThirdPlayer = scanner.nextInt();

        System.out.print("Enter frag number for Player #4: ");
        int policeFourthPlayer = scanner.nextInt();

        System.out.print("Enter frag number for Player #5: ");
        int policeFifthPlayer = scanner.nextInt();

        scanner.nextLine();

        int policeTeamTotal = policeFirstPlayer + policeSecondPlayer + policeThirdPlayer + policeFourthPlayer + policeFifthPlayer;
        int teamSize = 5;
        double averagePoliceScore = (double) policeTeamTotal / teamSize;

        System.out.printf("Average frag number for %s = %.2f \n", policeTeamName, averagePoliceScore);


        //Team2

        System.out.print("Enter the name of the Terrorists team: ");
        String terroristsTeamName = scanner.nextLine();

        System.out.print("Enter frag number for Player #1: ");
        int terroristsFirstPlayer = scanner.nextInt();

        System.out.print("Enter frag number for Player #2: ");
        int terroristsSecondPlayer = scanner.nextInt();

        System.out.print("Enter frag number for Player #3: ");
        int terroristsThirdPlayer = scanner.nextInt();

        System.out.print("Enter frag number for Player #4: ");
        int terroristsFourthPlayer = scanner.nextInt();

        System.out.print("Enter frag number for Player #5: ");
        int terroristsFifthPlayer = scanner.nextInt();

        scanner.nextLine();
        int terroristsTeamTotal = terroristsFirstPlayer + terroristsSecondPlayer + terroristsThirdPlayer + terroristsFourthPlayer + terroristsFifthPlayer;
        double averageTerroristsScore = (double) terroristsTeamTotal / teamSize;

        System.out.printf("Average frag number for %s = %.2f \n", terroristsTeamName, averageTerroristsScore);


        //Define the winner


        if (averagePoliceScore + averageTerroristsScore == 0) {
            System.out.println("This boring game is over at last! " +
                    "Both teams got NO points. " +
                    "I hope, we will never see " + policeTeamName + " and " + terroristsTeamName + " again!");
        } else if (averagePoliceScore > averageTerroristsScore) {
            System.out.printf("The winner is %s! The score is %.2f to %.2f! \n", policeTeamName, averagePoliceScore, averageTerroristsScore);
        } else if (averagePoliceScore < averageTerroristsScore) {
            System.out.printf("The winner is %s! The score is %.2f to %.2f! \n", terroristsTeamName, averageTerroristsScore, averagePoliceScore);
        } else {
            System.out.printf("The game finished with the draw. Both teams' score is %.2f! \n", averagePoliceScore);
        }

    }
}
