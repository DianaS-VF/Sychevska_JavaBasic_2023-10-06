package com.gmail.sychevska.homeworks;

public class TrackerUser {
    final String name;
    private String lastName;
    final int dayOfBirth;
    final int monthOfBirth;
    final int yearOfBirth;
    private double weight;
    private String bloodPressure;
    private int stepsNumber;
    final String email;
    final String phoneNumber;


    public TrackerUser(String name, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, double weight, String bloodPressure, int stepsNumber, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsNumber = stepsNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsNumber(int stepsNumber) {
        this.stepsNumber = stepsNumber;
    }

    public void printAccountInfo() {
        int currentYear = 2023;
        int age = currentYear - yearOfBirth;
        System.out.println("\nFirst Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Number of Steps: " + stepsNumber);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age + " years");


    }
}
