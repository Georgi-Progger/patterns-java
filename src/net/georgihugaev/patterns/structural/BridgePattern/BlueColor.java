package net.georgihugaev.patterns.structural.BridgePattern;

public class BlueColor implements Color{
    @Override
    public void drawColor() {
        System.out.println("Draw blue color Shape");
    }
}
