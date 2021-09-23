package com.company;

import com.company.devices.Phone;
import com.company.devices.Car;


public class Main {

    public static void main(String[] args) {
        Phone iphone = new Phone("11", "Apple", 2020, 6.0, "iOS");
        iphone.turnOn();
        System.out.println(iphone.model);
    }
}