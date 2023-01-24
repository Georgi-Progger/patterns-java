package net.georgihugaev.patterns.behaivor.VisitorPattern;

public interface Developer {
    void create(Database database);

    void create(Test test);
}
