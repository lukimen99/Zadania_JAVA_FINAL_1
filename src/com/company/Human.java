package com.company;
import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car auto;
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
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
    }
}