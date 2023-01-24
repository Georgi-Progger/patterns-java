package net.georgihugaev.patterns.behaivor.VisitorPattern;

public class Database implements ProdElement{
    @Override
    public void doElement(Developer developer) {
        developer.create(this);
    }
}
