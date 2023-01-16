package net.georgihugaev.patterns.AbstractFactoryMethod;

import net.georgihugaev.patterns.AbstractFactoryMethod.WindowsPackage.WindowsGUIFactory;

class AppRun {
    public static void main(String[] args) {
        GUIFactory windowFactory = new WindowsGUIFactory();
        windowFactory.createButton();
        windowFactory.createSelect();
        windowFactory.createTextField();

    }
}
