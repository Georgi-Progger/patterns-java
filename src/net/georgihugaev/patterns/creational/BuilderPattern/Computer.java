package net.georgihugaev.patterns.creational.BuilderPattern;

public class Computer {
    private Integer price;
    private String nameComputer;
    private Model model;

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setNameComputer(String nameComputer) {
        this.nameComputer = nameComputer;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", nameComputer='" + nameComputer + '\'' +
                ", model=" + model +
                '}';
    }
}
