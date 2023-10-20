package com.gmail.sychevska.homeworks;

public class PersonPrintLn {
    String firstName;
    String lastName;
    String city;
    String phoneNumber;

    public void printInfo(String firstName, String lastName, String city, String phoneNumber) {
        System.out.println("You can call Mr " + firstName + " " + lastName + " from " + city + " by number " + phoneNumber + ".");
    }
}
