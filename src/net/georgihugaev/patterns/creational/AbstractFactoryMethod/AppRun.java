package net.georgihugaev.patterns.creational.AbstractFactoryMethod;

import net.georgihugaev.patterns.creational.AbstractFactoryMethod.WindowsPackage.WindowsGUIFactory;

class AppRun {
    public static void main(String[] args) {
        GUIFactory windowFactory = new WindowsGUIFactory();
        windowFactory.createButton();
        windowFactory.createSelect();
        windowFactory.createTextField();

    }
}
