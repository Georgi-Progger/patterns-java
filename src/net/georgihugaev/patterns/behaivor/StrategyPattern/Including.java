package net.georgihugaev.patterns.behaivor.StrategyPattern;

public class Including implements Condition {
    @Override
    public void act() {
        System.out.println("System is on");
    }
}
