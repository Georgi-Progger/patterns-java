package net.georgihugaev.patterns.structural.FlyweightPattern;

public class HeartSurgeon implements Surgeon{
    @Override
    public void heal() {
        System.out.println("HeartSurgeon healing");
    }
}
