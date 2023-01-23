package net.georgihugaev.patterns.structural.CompositePattern;

public class AppRun {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape cub = new Cub();
        AllShape allShape = new AllShape();
        allShape.addShape(rectangle);
        allShape.addShape(cub);
        allShape.draw("blue");
    }
}
