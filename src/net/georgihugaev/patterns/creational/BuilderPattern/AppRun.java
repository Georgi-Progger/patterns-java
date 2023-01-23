package net.georgihugaev.patterns.creational.BuilderPattern;

public class AppRun {
    public static void main(String[] args) {
        Director director = new Director();

        director.setComputerBuilder(new AcerComputerBuilder());

        Computer computer = director.buildComputer();
        System.out.println(computer.toString());
    }
}
