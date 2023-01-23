package net.georgihugaev.patterns.structural.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class SurgeonFactory {
    private static final Map<String, Surgeon> surgeons = new HashMap<>();

    public Surgeon getSurgeon(String specialty) {
        Surgeon surgeon = surgeons.get(specialty);

        if (surgeon == null){
            switch (specialty){
                case "neuro":
                    System.out.println("Hiring neuro");
                    surgeon = new NeuroSurgeon();
                    break;
                case "heart":
                    System.out.println("Hiring heart");
                    surgeon = new HeartSurgeon();
                    break;
            }
            surgeons.put(specialty, surgeon);
        }
        return surgeon;
    }
}
