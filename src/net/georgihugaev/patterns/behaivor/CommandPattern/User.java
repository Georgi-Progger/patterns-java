package net.georgihugaev.patterns.behaivor.CommandPattern;

public class User {
    Command on;
    Command off;

    public User(Command on, Command off) {
        this.on = on;
        this.off = off;
    }

    public void on(){
        on.execute();
    }
    public void off(){
        off.execute();
    }
}
