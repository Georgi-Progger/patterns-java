package net.georgihugaev.patterns.behaivor.ChainOfResponsibility;

public class EmailMiddleware extends Middleware{
    public EmailMiddleware(int priority) {
        super(priority);
    }

    @Override
    public void check(String email) {
        System.out.println("IS GOOD : email is " + email);
    }
}
