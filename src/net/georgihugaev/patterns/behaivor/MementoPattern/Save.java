package net.georgihugaev.patterns.behaivor.MementoPattern;

public class Save {
    private final String version;

    public Save(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
