package net.georgihugaev.patterns.behaivor.CommandPattern;

public class ButtonOn implements Command{
    TV television;

    public ButtonOn(TV television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }
}
