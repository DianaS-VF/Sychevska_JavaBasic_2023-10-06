package com.gmail.sychevska.homeworks;

public class PersonPrintLnRunner {
    public static void main(String[] args) {

        PersonPrintLn firstPerson = new PersonPrintLn();
        firstPerson.printInfo("Will", "Smith", "New York", "2936729462846");
        System.out.println("=================================================================");

        PersonPrintLn secondPerson = new PersonPrintLn();
        secondPerson.printInfo("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println("=================================================================");

        PersonPrintLn thirdPerson = new PersonPrintLn();
        thirdPerson.printInfo("Sherlock", "Holmes", "London", "37742123513");
    }
}
