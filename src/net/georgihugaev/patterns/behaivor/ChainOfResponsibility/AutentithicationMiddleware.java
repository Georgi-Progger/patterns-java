package net.georgihugaev.patterns.behaivor.ChainOfResponsibility;

public class AutentithicationMiddleware extends Middleware{
    public AutentithicationMiddleware(int priority) {
        super(priority);
    }

    @Override
    public void check(String email) {
        System.out.println("Welcome " + email);
    }
}
