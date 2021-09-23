package com.company.devices;
import com.company.devices.Device;
import com.company.Sellable;

public abstract class Device implements Sellable {

    public final String model;
    public final String producer;
    public final Integer yearofproduction;

    public Device(String model, String producer, Integer yearofproduction) {
        this.model = model;
        this.producer = producer;
        this.yearofproduction = yearofproduction;

    }

    public abstract void turnOn();




    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearofproduction=" + yearofproduction +
                '}';
    }


}