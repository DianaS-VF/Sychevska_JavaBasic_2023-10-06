package com.gmail.sychevska.homeworks;

public class PersonStringEmptyMethod {
    private String firstName;
    private String lastName;
    private String city;
    private String phoneNumber;

    public PersonStringEmptyMethod(String firstName, String lastName, String city, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String printInfo() {
        return "You can call Mr " + firstName + " " + lastName + " from " + city + " by number " + phoneNumber + ".";
    }
}
