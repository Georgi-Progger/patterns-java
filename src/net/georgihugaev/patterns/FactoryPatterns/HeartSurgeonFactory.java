package net.georgihugaev.patterns.FactoryPatterns;

public class HeartSurgeonFactory implements ISurgeonFactory{
    @Override
    public ISurgeon create() {
        return new HeartSurgeon();
    }
}
