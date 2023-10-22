package com.gmail.sychevska.homeworks;

public class TrackerUser {
    private final String name;
    private String lastName;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private double weight;
    private String bloodPressure;
    private int stepsNumber;
    private final String email;
    private final String phoneNumber;
    private final int age;


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
        int currentYear = 2023;
        this.age = currentYear - yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
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

    public double getWeight() {
        return weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public int getStepsNumber() {
        return stepsNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
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
