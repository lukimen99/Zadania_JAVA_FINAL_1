package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.feed();

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();

        Phone iPhone = new Phone("Apple", "7", 4.5, "ios");

        Human me = new Human("Lukasz", "Sobolewski", "123456789", dog);
        me.pet.takeForAWalk();
        me.pet.feed();
        System.out.println("pet name is: " + me.pet.name);
    }
}