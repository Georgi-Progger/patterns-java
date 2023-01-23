package net.georgihugaev.patterns.structural.FacadePattern;

public class Key implements Transport{
    @Override
    public void start() {
        System.out.println("Ключ вставлен");
    }

    @Override
    public void stop() {
        System.out.println("Ключ вытащен");
    }
}
