package net.georgihugaev.patterns.behaivor.ChainOfResponsibility;

public class RoleMiddleware extends Middleware{
    private static final String role = "ADMIN";

    public RoleMiddleware(int priority) {
        super(priority);
    }

    @Override
    public void check(String email) {
        System.out.println(email + " is " + role);
    }
}
