package com.gmail.sychevska.homeworks;

import javax.crypto.spec.PSource;

public class TrackerRunner {
    public static void main(String[] args) {
        TrackerUser firstUser = new TrackerUser(
                "John",
                "Smith",
                1,
                3,
                1980,
                50.5,
                "120/80",
                15000,
                "info@info.com",
                "12345678");
        firstUser.printAccountInfo();
        System.out.println("********************************");

        TrackerUser secondUser = new TrackerUser(
                "Eliza",
                "Sommersby",
                5,
                5,
                1990,
                72,
                "110/55",
                8000,
                "i@i.com",
                "98765432");
        secondUser.printAccountInfo();
        System.out.println("********************************");

        TrackerUser thirdUser = new TrackerUser(
                "Chris",
                "Murphy",
                30,
                6,
                1995,
                75,
                "130/80",
                9000,
                "info2@info.com",
                "1112223");
        thirdUser.printAccountInfo();
        System.out.println("********************************");

        TrackerUser fourthUser = new TrackerUser(
                "Jane",
                "Austen",
                13,
                12,
                1993,
                55.2,
                "90/50",
                8000,
                "info3@info.com",
                "2223331");
        fourthUser.printAccountInfo();

        fourthUser.setWeight(90);
        fourthUser.setLastName("Black");
        fourthUser.setBloodPressure("140/100");
        fourthUser.setStepsNumber(8);
        fourthUser.printAccountInfo();
        System.out.println("********************************");

        TrackerUser fifthUser = new TrackerUser(
                "John",
                "Snow",
                31,
                12,
                1997,
                100,
                "150/120",
                10,
                "info4@info.com",
                "+447778889");
        fifthUser.printAccountInfo();

        fifthUser.setWeight(62);
        fifthUser.setBloodPressure("120/60");
        fifthUser.setStepsNumber(15000);
        fifthUser.printAccountInfo();
        System.out.println("********************************");
    }


}






