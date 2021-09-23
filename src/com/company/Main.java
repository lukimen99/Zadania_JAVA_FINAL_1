package com.company;

import devices.Car;
import devices.Phone;

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
        Car ford = new Car("Mondeo", "Ford", 5000.0);

        System.out.println(me.getCar());
        me.setCar(ford);

        Car car1 = new Car("mustang", "ford", 8000.0);
        Car car2 = new Car("mustang", "ford", 8000.0);
        System.out.println(car1);
        System.out.println(car2);


        me.getSalary();
        me.setSalary(5000);
        me.getSalary();
    }
}