package net.georgihugaev.patterns.creational.AbstractFactoryMethod;

public interface GUIFactory {
    Button createButton();
    Select createSelect();
    TextField createTextField();
}
