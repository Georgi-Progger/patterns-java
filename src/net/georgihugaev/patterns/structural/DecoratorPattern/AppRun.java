package net.georgihugaev.patterns.structural.DecoratorPattern;

public class AppRun {
    public static void main(String[] args) {
        Shape rectangle = new RedRectangle(new Rectangle());

        rectangle.draw();
    }
}
