package com.gmail.sychevska.homeworks;

public class PersonString {
    String firstName;
    String lastName;
    String city;
    String phoneNumber;

    public String printInfo(String firstName, String lastName, String city, String phoneNumber) {
        return "You can call Mr " + firstName + " " + lastName + " from " + city + " by number " + phoneNumber + ".";
    }
}
