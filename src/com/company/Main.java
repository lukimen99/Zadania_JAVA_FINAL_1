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
        me.auto = new Car("Mondeo", "Ford", 50000.00);
        me.setCar(me.auto);
        System.out.println(me.getCar());

        me.getSalary();
        me.setSalary(5000);
        me.getSalary();
    }
}