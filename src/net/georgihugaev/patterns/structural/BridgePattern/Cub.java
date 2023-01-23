package net.georgihugaev.patterns.structural.BridgePattern;

public class Cub extends Shape {
    Cub(Color color){
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("Drawing cub");
        color.drawColor();
    }
}