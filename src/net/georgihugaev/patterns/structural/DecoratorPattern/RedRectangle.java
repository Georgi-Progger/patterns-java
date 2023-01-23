package net.georgihugaev.patterns.structural.DecoratorPattern;

public class RedRectangle extends DecoratorShape{
    public RedRectangle(Shape shape) {
        super(shape);
    }

    private void drawColor(){
        System.out.print("Color draw red");
    }

    @Override
    public void draw() {
        super.draw();
        drawColor();
    }
}
