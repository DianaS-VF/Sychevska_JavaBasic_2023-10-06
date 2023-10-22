package com.gmail.sychevska.homeworks;

public class Burger {
    private String bun;
    private String meat;
    private String additionalMeat;
    private String cheese;
    private String lettuce;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        System.out.println("Ordinary burger: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise + ".");
    }

    public Burger(String bun, String meat, String cheese, String lettuce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        System.out.println("Diet burger: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ".");
    }

    public Burger(String bun, String meat, String additionalMeat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.additionalMeat = additionalMeat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        System.out.println("Double meat burger: " + bun + ", " + additionalMeat + " " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise + ".");
    }
}
