package net.georgihugaev.patterns.FactoryPatterns;

public class NeuroSurgeonFactory implements ISurgeonFactory{
    @Override
    public ISurgeon create() {
        return new NeuroSurgeon();
    }
}
