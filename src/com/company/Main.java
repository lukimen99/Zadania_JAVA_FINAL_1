package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Phone;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Pet luger = new Pet("dog", "Damian");
        Human Lukasz = new Human("Lukasz", "Sobolewski", "123456789", luger);
        Lukasz.pet.takeForAWalk();
        luger.takeForAWalk();
    }
}