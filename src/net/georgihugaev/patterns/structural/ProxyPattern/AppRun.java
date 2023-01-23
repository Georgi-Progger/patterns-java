package net.georgihugaev.patterns.structural.ProxyPattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AppRun {
    public static void main(String[] args) {
        Image image = new ProxyImage("ftp://im.ru");

        image.display();
    }
}
