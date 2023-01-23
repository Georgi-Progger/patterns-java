package net.georgihugaev.patterns.behaivor.ChainOfResponsibility;

public class AppRun {
    public static void main(String[] args) {
        Middleware email = new EmailMiddleware(Priority.ROUTINE);
        Middleware role = new RoleMiddleware(Priority.IMPORTANT);
        Middleware authentithication = new AutentithicationMiddleware(Priority.ASAP);

        email.setNext(role);
        role.setNext(authentithication);

        email.middlewareManager("hugaeag@gmail.com ", Priority.ROUTINE);
        email.middlewareManager("hugaeag@gmail.com ", Priority.IMPORTANT);
        email.middlewareManager("hugaeag@gmail.com ", Priority.ASAP);
    }
}
