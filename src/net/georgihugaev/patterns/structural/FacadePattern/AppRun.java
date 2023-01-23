package net.georgihugaev.patterns.structural.FacadePattern;

public class AppRun {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.start();
        System.out.println();
        facade.stop();
    }
}
