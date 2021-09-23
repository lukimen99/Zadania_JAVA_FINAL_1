package com.company;

import java.io.File;

public class Animal {
    final public String species;
    public String name;
    public File pic;
    private Double weight;
    private static final double DEFAULT_WALK_WEIGHT = 1;
    static final public double ANIMAL_WEIGHT=1.0;
    static final public double DOG_WEIGHT=6.0;
    static final public double CAT_WEIGHT=3.0;
    static final public double COW_WEIGHT=250.0;
    static final public double DEFAULT_FOOD_WEIGHT=1.0;

    public Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog" -> this.weight = DOG_WEIGHT;
            case "cat" -> this.weight = CAT_WEIGHT;
            case "cow" -> this.weight = COW_WEIGHT;
            default -> this.weight = ANIMAL_WEIGHT;
        }


    }


    void feed() {
        if(weight>=0){
            weight+=DEFAULT_FOOD_WEIGHT;
            System.out.println("Thx human "+weight);
        }
        else{
            System.out.println("Food won't make me alive human");
        }

    }
    void takeForAWalk(){
        if (weight>=0){
            weight-=DEFAULT_WALK_WEIGHT;
            System.out.println("Thx for a walk Human "+weight);
            if(weight<=0){
                System.out.println("Nah human I need food");
            }
        }
        else {
            System.out.println("I am dead human");
        }
    }
}

