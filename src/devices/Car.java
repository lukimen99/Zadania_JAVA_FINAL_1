package devices;

public class Car {
    final private String producer;
    final private String model;
    public Double value;


    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.value = value;

    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", value=" + value +
                '}';
    }
}

