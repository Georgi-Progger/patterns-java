package net.georgihugaev.patterns.structural.ProxyPattern;

public class ProxyImage implements Image{
    RealImage image;

    String url;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (image == null){
            image = new RealImage(url);
        }
        image.display();
    }
}
