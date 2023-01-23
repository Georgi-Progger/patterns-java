package net.georgihugaev.patterns.creational.PrototypePattern;

public class CarFactory {
    Car car;

    CarFactory(Car car){
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car cloneFactory() {
        return (Car) this.car.copy();
    }
}
