package net.georgihugaev.patterns.behaivor.CommandPattern;

public class ButtonOff implements Command{
    TV television;

    public ButtonOff(TV television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }
}
