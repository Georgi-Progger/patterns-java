package net.georgihugaev.patterns.AbstractFactoryMethod;

public class NeuroSurgeon implements ISurgeon {
    @Override
    public void saySpecialty() {
        System.out.print("I am Neuro ISurgeon");
    }
}
