package net.georgihugaev.patterns.structural.FlyweightPattern;

public class NeuroSurgeon implements Surgeon{
    @Override
    public void heal() {
        System.out.println("NeuroSurgeon healing");
    }
}
