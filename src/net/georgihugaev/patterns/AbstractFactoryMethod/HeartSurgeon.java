package net.georgihugaev.patterns.AbstractFactoryMethod;

public class HeartSurgeon implements ISurgeon {
    @Override
    public void saySpecialty() {
        System.out.print("I am Heart ISurgeon");
    }
}
