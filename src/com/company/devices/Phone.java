package com.company.devices;
import com.company.Human;
import com.company.devices.Phone;

public abstract class Phone extends Device {
    final public Double screenSize;
    final public String operationSystem;

    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(model, producer, yearofproduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println(("Nie możesz sprzedać jak nie masz"));
        } else if (buyer.cash < price) {
            System.out.println(("Nie masz tyle kaski"));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println(("Transakcja udana" + this + " za " + price));
        }
    }
}