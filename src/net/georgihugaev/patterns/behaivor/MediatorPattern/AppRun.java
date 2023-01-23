package net.georgihugaev.patterns.behaivor.MediatorPattern;

public class AppRun {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "adminer");

        User user1 = new SimpleUser(chat, "user1");
        User user2 = new SimpleUser(chat, "user2");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage(" Hello");
    }
}
