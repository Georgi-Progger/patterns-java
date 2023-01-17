package net.georgihugaev.patterns.BuilderPattern;

public class Director{
    ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }


    Computer buildComputer(){
        computerBuilder.computerCreated();
        computerBuilder.buildModel();
        computerBuilder.buildNameComputer();
        computerBuilder.buildPrice();

        Computer computer = computerBuilder.getComputer();
        return computer;
    }

}
