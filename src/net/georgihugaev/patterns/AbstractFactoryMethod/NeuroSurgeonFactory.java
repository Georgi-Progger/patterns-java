package net.georgihugaev.patterns.AbstractFactoryMethod;

public class NeuroSurgeonFactory implements ISurgeonFactory{
    @Override
    public ISurgeon create() {
        return new NeuroSurgeon();
    }
}
