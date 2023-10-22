package com.gmail.sychevska.homeworks;

public class BurgerMain {
    public static void main(String[] args) {
        Burger ordinaryBurger = new Burger("bun", "meat", "cheese", "lettuce", "mayonnaise");
        Burger dietBurger = new Burger("bun", "meat", "cheese", "lettuce");
        Burger doubleMeat = new Burger("bun", "meat", "double", "cheese", "lettuce", "mayonnaise");
    }
}
