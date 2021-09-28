package com.company.creatures;

import com.company.Human;
import com.company.Salleable;

import java.io.File;

public abstract class Animal implements Salleable, Feedable {
    final public String species;
    public String name;
    public File pic;
    protected Double weight;
    private static final Double DEFAULT_FOOD_WEIGHT = 0.2;
    private final static Double DEFAULT_ANIMAL_WEIGHT = 2.0;
    private final static Double DEFAULT_CAT_WEIGHT = 3.0;
    private final static Double DEFAULT_DOG_WEIGHT = 4.0;
    private final static Double DEFAULT_COW_WEIGHT = 250.0;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        switch (this.species) {
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "cow" -> this.weight = DEFAULT_COW_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed() {
        if (weight > 0) {
            weight += DEFAULT_FOOD_WEIGHT;
            System.out.print("Animal weight is now " + this.weight + "\n");
        } else
            System.out.print("This animal died.\n");
    }

    public void takeForAWalk() {
        if (weight > 0) {
            weight -= DEFAULT_FOOD_WEIGHT;
            System.out.print("Thx for a walk Human " + this.weight + "\n");
        } else
            System.out.print("Your pet died. You monster!\n");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this) {
            System.out.println(("Nie możesz sprzedać czegoś czego nie posiadasz"));
        } else if (buyer.cash < price) {
            System.out.println(("Nie masz tyle kaski"));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println(("Transakcja udana, sprzedano " + this + " za " + price));
        }
    }
}
