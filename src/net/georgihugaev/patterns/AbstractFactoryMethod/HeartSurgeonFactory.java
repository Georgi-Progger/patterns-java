package net.georgihugaev.patterns.AbstractFactoryMethod;

public class HeartSurgeonFactory implements ISurgeonFactory{
    @Override
    public ISurgeon create() {
        return new HeartSurgeon();
    }
}
