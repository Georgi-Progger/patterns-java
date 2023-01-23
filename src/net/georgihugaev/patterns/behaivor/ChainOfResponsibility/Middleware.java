package net.georgihugaev.patterns.behaivor.ChainOfResponsibility;

public abstract class Middleware {
    private int priority;
    private Middleware next;

    public Middleware(int priority) {
        this.priority = priority;
    }

    public void setNext(Middleware next) {
        this.next = next;
    }

    public void middlewareManager(String email, int level) {
        if (level >= priority){
            check(email);
        }
        if (next != null){
            next.middlewareManager(email, level);
        }
    }

    public abstract void check(String email);
}
