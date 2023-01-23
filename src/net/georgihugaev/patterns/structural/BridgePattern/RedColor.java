package net.georgihugaev.patterns.structural.BridgePattern;

public class RedColor implements Color{
    @Override
    public void drawColor() {
        System.out.println("Draw red color Shape");
    }
}
