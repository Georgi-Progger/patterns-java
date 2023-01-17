package net.georgihugaev.patterns.PrototypePattern;


class AppRun {
    public static void main(String[] args) {
        Car car = new Car("LADA", 50000);
        System.out.println(car.toString());
        System.out.println();
        Car car2 = new CarFactory(car).cloneFactory();
        System.out.println(car2.toString());
    }
}
