package net.georgihugaev.patterns.behaivor.StatePattern;

public class Turning implements Condition{
    @Override
    public void act() {
        System.out.println("System is off");
    }
}
