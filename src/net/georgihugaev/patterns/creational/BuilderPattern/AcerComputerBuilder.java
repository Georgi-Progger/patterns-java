package net.georgihugaev.patterns.creational.BuilderPattern;

public class AcerComputerBuilder extends ComputerBuilder{
    @Override
    void buildNameComputer() {
        computer.setNameComputer("Acer");
    }

    @Override
    void buildModel() {
        computer.setModel(Model.NOTEBOOK);
    }

    @Override
    void buildPrice() {
        computer.setPrice(50000);
    }
}
