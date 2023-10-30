package com.gmail.sychevska.homeworks.interfaces;

public class iPhones implements Smartphones, iOS {
    public void call() {
        System.out.println("Make calls from iPhone");
    }

    public void sms() {
        System.out.println("Send SMS from iPhone");
    }

    public void internet() {
        System.out.println("Browse internet from iPhone");
    }

    public void icloud() {
        System.out.println("Use iCloud from iPhone");
    }
}
