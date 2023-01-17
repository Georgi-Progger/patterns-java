package net.georgihugaev.patterns.BuilderPattern;

public abstract class ComputerBuilder {
    Computer computer;

    public void computerCreated(){
        computer = new Computer();
    }

    abstract void buildNameComputer();
    abstract void buildModel();
    abstract void buildPrice();

    Computer getComputer(){
        return computer;
    }

}
