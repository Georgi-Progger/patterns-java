package net.georgihugaev.patterns.behaivor.CommandPattern;

public class AppRun {
    public static void main(String[] args) {
        TV television = new TV();

        User user = new User(
                new ButtonOn(television),
                new ButtonOff(television)
        );

        user.on();
        user.off();
    }
}
