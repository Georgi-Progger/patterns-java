package net.georgihugaev.patterns.behaivor.TemplateMethodPattern;

public abstract class AllDaysDo {
    void mundaneDo(){
        System.out.println("Get up");
        doWholeDay();
        System.out.println("Go to sleep");
    }

    abstract void doWholeDay();
}
