package com.gmail.sychevska.homeworks.interfaces;

public class InterfacesRunner {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.openSource();

        iPhones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.icloud();
    }
}
