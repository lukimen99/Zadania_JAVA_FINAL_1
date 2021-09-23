package com.company;

import java.io.File;

public class Animal implements Sellable {
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

    @Override
    public String toString() {
        return "Animal{" +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
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
            System.out.println(("Tranzakcja udana" + this + " za " + price));
        }
    }
}

