package net.georgihugaev.patterns.creational.PrototypePattern;

public class Car implements Copyable{
    private String model;
    private Integer price;

    public Car(String model, Integer price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public Object copy() {
        Car car = new Car(model , price);
        return car;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
