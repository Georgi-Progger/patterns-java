package net.georgihugaev.patterns.behaivor.IteratorPattern;

public class AppRun {
    public static void main(String[] args) {
        String[] skills = {"Python", "Java", "C#"};

        Developer developer = new Developer(skills);

        Iterator iterator = developer.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
