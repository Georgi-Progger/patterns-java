package net.georgihugaev.patterns.structural.FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class AppRun {
    public static void main(String[] args) {
        SurgeonFactory surgeonFactory = new SurgeonFactory();

        List<Surgeon> surgeons = new ArrayList<>();


        surgeons.add(surgeonFactory.getSurgeon("neuro"));
        surgeons.add(surgeonFactory.getSurgeon("neuro"));
        surgeons.add(surgeonFactory.getSurgeon("neuro"));
        surgeons.add(surgeonFactory.getSurgeon("neuro"));
        surgeons.add(surgeonFactory.getSurgeon("neuro"));

        for (var surgeon : surgeons){
            surgeon.heal();
        }
    }
}
