package net.georgihugaev.patterns.structural.CompositePattern;

public class Rectangle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Drawing rectangle color is " + color);
    }
}
