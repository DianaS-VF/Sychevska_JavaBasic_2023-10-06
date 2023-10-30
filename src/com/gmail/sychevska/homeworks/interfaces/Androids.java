package com.gmail.sychevska.homeworks.interfaces;

public class Androids implements Smartphones, LinuxOS {
    public void call() {
        System.out.println("Make calls from Android");
    }

    public void sms() {
        System.out.println("Send SMS from Android");
    }

    public void internet() {
        System.out.println("Browse internet from Android");
    }

    public void openSource() {
        System.out.println("Open Source for Android");
    }
}
