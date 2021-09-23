package com.company;
import com.company.devices.Car;

import java.time.LocalTime;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    private Car auto;
    protected String phone;
    private Double salary;

    public Double getSalary() {
        System.out.println(LocalTime.now());
        System.out.println(salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            System.out.println("Płaca na minusie");
        else {
            System.out.println("Dane wyslane do ksiegowej");
            System.out.println("Odbierz aneks od pani Hani z kadr");
            System.out.println("Zus i US już wiedzą o zmianie wypłaty");
            this.salary = salary;
        }
    }

    public Human(String firstName, String lastName, String phone, Animal pet) {
        super("homosapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
    }

    public Car getCar() {
        return auto;
    }

    public void setCar(Car auto) {
        if (salary > auto.value) {
            this.auto = auto;
            System.out.println("Samochód zakupiony");
        } else if (salary > (auto.value) / 12) {
            this.auto = auto;
            System.out.println("Kupiłeś samochód na raty");
        } else {
            System.out.println("Idź na studia czy coś");
        }

    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", auto=" + auto +
                ", salary=" + salary +
                '}';
    }
}