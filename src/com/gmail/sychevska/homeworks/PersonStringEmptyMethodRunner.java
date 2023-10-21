package com.gmail.sychevska.homeworks;

public class PersonStringEmptyMethodRunner {
    public static void main(String[] args) {

        PersonStringEmptyMethod firstPerson = new PersonStringEmptyMethod("Will", "Smith", "New York", "2936729462846");
        System.out.println(firstPerson.printInfo());
        System.out.println("=================================================================");

        PersonStringEmptyMethod secondPerson = new PersonStringEmptyMethod("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(secondPerson.printInfo());
        System.out.println("=================================================================");

        PersonStringEmptyMethod thirdPerson = new PersonStringEmptyMethod("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(thirdPerson.printInfo());
    }
}
