package net.georgihugaev.patterns.AbstractFactoryMethod;

public interface GUIFactory {
    Button createButton();
    Select createSelect();
    TextField createTextField();
}
