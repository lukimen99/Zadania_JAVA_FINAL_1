package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", 8.5, "Haiku");
        dog.feed();

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();

        Phone iPhone = new Phone("Apple", "7", 4.5, "ios");

        Human me = new Human("Lukasz", "Sobolewski", "123456789", dog);

        System.out.println("Pet name is: " + me.pet.name);
    }
}