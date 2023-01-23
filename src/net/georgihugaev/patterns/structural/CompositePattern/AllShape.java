package net.georgihugaev.patterns.structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class AllShape implements Shape{
    List<Shape> allShapes = new ArrayList<Shape>();
    @Override
    public void draw(String color) {
        for (Shape shape : allShapes){
            shape.draw(color);
        }
    }

    public void addShape(Shape shape){
        this.allShapes.add(shape);
    }

}
