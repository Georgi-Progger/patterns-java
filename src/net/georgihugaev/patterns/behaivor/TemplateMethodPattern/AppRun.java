package net.georgihugaev.patterns.behaivor.TemplateMethodPattern;

public class AppRun {
    public static void main(String[] args) {
        AllDaysDo georDay = new Geor();
        AllDaysDo eugeneDay = new Eugene();

        georDay.mundaneDo();
        eugeneDay.mundaneDo();
    }
}
