package net.georgihugaev.patterns.creational.FactoryPatterns;

public class HeartSurgeonFactory implements ISurgeonFactory{
    @Override
    public ISurgeon create() {
        return new HeartSurgeon();
    }
}
