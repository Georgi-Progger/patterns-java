package net.georgihugaev.patterns.behaivor.MementoPattern;

public class AppRun {
    public static void main(String[] args) {
        ProjectWord word = new ProjectWord();

        WordFile file = new WordFile();

         word.setVersion("Version 1");
        System.out.println(word.toString());
         file.setSave(word.save());

         word.setVersion("Version 2");
        System.out.println(word.toString());
         word.load(file.getSave());
        System.out.println(word.toString());
    }
}
