package com.company;
import com.company.devices.Phone;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Human Lukasz = new Human("Lukasz", "Sobolewski");
        Lukasz.pet = new Animal("dog");

        Human ktos = new Human("Marek", "Kowalski");
        ktos.cash = 3000.0;
        Lukasz.pet.sell(Lukasz, ktos, 200.0);


    }
}