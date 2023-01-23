package net.georgihugaev.patterns.creational.AbstractFactoryMethod.WindowsPackage;

import net.georgihugaev.patterns.creational.AbstractFactoryMethod.Button;
import net.georgihugaev.patterns.creational.AbstractFactoryMethod.GUIFactory;
import net.georgihugaev.patterns.creational.AbstractFactoryMethod.Select;
import net.georgihugaev.patterns.creational.AbstractFactoryMethod.TextField;

public class WindowsGUIFactory implements GUIFactory {
    public WindowsGUIFactory(){
        System.out.println("Creating Window GUI");
    }

    @Override
    public Button createButton() {
        System.out.println("Create Windows Button");
        return new WindowButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Create Windows Select");
        return new WindowsSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Create Windows Text Field");
        return new WindowsTextField();
    }
}
