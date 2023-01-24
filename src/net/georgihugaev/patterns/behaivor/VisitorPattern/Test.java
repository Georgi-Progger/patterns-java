package net.georgihugaev.patterns.behaivor.VisitorPattern;

public class Test implements ProdElement{
    @Override
    public void doElement(Developer developer) {
        developer.create(this);
    }
}
