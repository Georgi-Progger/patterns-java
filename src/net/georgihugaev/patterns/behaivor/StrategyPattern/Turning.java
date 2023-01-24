package net.georgihugaev.patterns.behaivor.StrategyPattern;

public class Turning implements Condition {
    @Override
    public void act() {
        System.out.println("System is off");
    }
}
