package net.georgihugaev.patterns.structural.DecoratorPattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Нарисован круг");
    }
}
