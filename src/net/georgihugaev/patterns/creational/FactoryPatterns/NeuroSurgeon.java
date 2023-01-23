package net.georgihugaev.patterns.creational.FactoryPatterns;

public class NeuroSurgeon implements ISurgeon {
    @Override
    public void saySpecialty() {
        System.out.print("I am Neuro ISurgeon");
    }
}
