package net.georgihugaev.patterns.structural.ProxyPattern;

public class RealImage implements Image{
    private String url;

    public RealImage(String url) {
        this.url = url;
        load(this.url);
    }

    void load(String url){
        System.out.println("Загрузка " + url );
    }

    @Override
    public void display() {
        System.out.println("Просмотр " + url);
    }
}
