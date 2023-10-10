package com.gmail.sychevska.homeworks;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int numbersInTicket = 7;
        int[] numbersOrganizer = generateNumbers(numbersInTicket);
        int[] numbersPlayer = generateNumbers(numbersInTicket);

        System.out.println("Numbers of the Organizer: ");

        System.out.println("Not sorted numbers: ");
        showNumbers(numbersOrganizer);
        System.out.println("Sorted Numbers: ");
        sortNumbers(numbersOrganizer);
        showNumbers(numbersOrganizer);
        System.out.println();

        System.out.println("Numbers of the Player: ");

        System.out.println("Not sorted numbers: ");
        showNumbers(numbersPlayer);
        System.out.println("Sorted Numbers: ");
        sortNumbers(numbersPlayer);
        showNumbers(numbersPlayer);
        System.out.println();

        int guessedPairs = findPairs(numbersOrganizer, numbersPlayer);
        if (guessedPairs == numbersInTicket) {
            System.out.println("Incredible! You've guessed all " + guessedPairs + " numbers!");
        } else if (guessedPairs == 0) {
            System.out.print("You've guessed " + guessedPairs + " numbers at all. Sorry, but lottery might be not for you");
        } else {
            System.out.print("You've guessed " + guessedPairs + " number(s). You were so close. Try later, may be you'll win next time.");
        }
    }


    public static int[] generateNumbers(int numbersInTicket) {
        int[] numbers = new int[numbersInTicket];
        int minValue = 0;
        int maxValue = 9;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
        }
        return numbers;
    }

    public static void showNumbers(int[] numbers) {
        for (int numberTicket : numbers) {
            System.out.print(numberTicket + " ");
        }
        System.out.println();
    }

    public static void sortNumbers(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
    }


    public static int findPairs(int[] numbersOrganizer, int[] numbersPlayer) {
        int guessedPairs = 0;
        for (int i = 0; i < Math.min(numbersOrganizer.length, numbersPlayer.length); i++) {
            if (numbersOrganizer[i] == numbersPlayer[i]) {
                guessedPairs++;
            }
        }
        return guessedPairs;
    }

}

