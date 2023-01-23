package net.georgihugaev.patterns.structural.BridgePattern;

public class AppRun {
    public static void main(String[] args) {
        Shape shape = new Rectangle(new BlueColor());

        shape.draw();
    }
}
