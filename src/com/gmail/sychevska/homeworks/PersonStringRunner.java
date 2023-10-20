package com.gmail.sychevska.homeworks;

public class PersonStringRunner {

    public static void main(String[] args) {

        PersonString firstPerson = new PersonString();
        String result;
        result = firstPerson.printInfo("Will", "Smith", "New York", "2936729462846");
        System.out.println(result);
        System.out.println("=================================================================");

        PersonString secondPerson = new PersonString();
        result = secondPerson.printInfo("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(result);
        System.out.println("=================================================================");

        PersonString thirdPerson = new PersonString();
        result = thirdPerson.printInfo("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(result);
    }
}
