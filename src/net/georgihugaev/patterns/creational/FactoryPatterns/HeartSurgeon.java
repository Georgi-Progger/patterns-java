package net.georgihugaev.patterns.creational.FactoryPatterns;

public class HeartSurgeon implements ISurgeon {
    @Override
    public void saySpecialty() {
        System.out.print("I am Heart ISurgeon");
    }
}
