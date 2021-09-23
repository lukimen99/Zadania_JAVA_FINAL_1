package com.company.devices;
import com.company.Human;
import com.company.Sellable;

public abstract class Car extends Device implements com.company.Sellable {
    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearofproduction, String color, Double value) {
        super(model, producer, yearofproduction);
        this.color = color;
        this.value = value;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.auto != this) {
            System.out.println(("Nie możesz sprzedać jak nie masz"));
        } else if (buyer.cash < price) {
            System.out.println(("Nie masz tyle kaski"));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.auto = seller.auto;
            seller.auto = null;
            System.out.println(("Transakcja udana" + this + " za " + price));
        }


    }

}

