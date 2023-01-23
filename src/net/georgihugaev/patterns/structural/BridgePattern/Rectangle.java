package net.georgihugaev.patterns.structural.BridgePattern;

public class Rectangle extends Shape {
    Rectangle(Color color){
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        color.drawColor();
    }
}