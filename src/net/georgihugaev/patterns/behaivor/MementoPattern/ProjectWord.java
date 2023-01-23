package net.georgihugaev.patterns.behaivor.MementoPattern;

public class ProjectWord {
    private String version;

    public void setVersion(String version) {
        this.version = version;
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version = save.getVersion();
    }
    @Override
    public String toString() {
        return "ProjectWord{" +
                "version='" + version + '\'' +
                '}';
    }
}
