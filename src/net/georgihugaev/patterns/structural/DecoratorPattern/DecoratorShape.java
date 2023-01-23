package net.georgihugaev.patterns.structural.DecoratorPattern;

public class DecoratorShape implements Shape{

    Shape shape;

    public DecoratorShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
