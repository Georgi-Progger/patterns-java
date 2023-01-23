package net.georgihugaev.patterns.creational.FactoryPatterns;

public class NeuroSurgeonFactory implements ISurgeonFactory{
    @Override
    public ISurgeon create() {
        return new NeuroSurgeon();
    }
}
