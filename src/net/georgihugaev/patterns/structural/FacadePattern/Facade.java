package net.georgihugaev.patterns.structural.FacadePattern;

public class Facade {
    Key key;
    Car car;

    public Facade() {
        key = new Key();
        car = new Car();
    }

    public void start(){
        key.start();
        car.start();
    }
    public void stop(){
        key.stop();
        car.stop();
    }

}
