package net.georgihugaev.patterns.FactoryPatterns;

class AppRun {
    public static void main(String[] args) {
        ISurgeonFactory surgeonFactory = createSurgeonFactory("heart");
        ISurgeon surgeon = surgeonFactory.create();

        surgeon.saySpecialty();
    }

    static ISurgeonFactory createSurgeonFactory(String surgeon) throws RuntimeException{
        if (surgeon.equalsIgnoreCase("neuro")) {
            return new NeuroSurgeonFactory();
        } else if (surgeon.equalsIgnoreCase("heart")) {
            return new HeartSurgeonFactory();
        }else {
            throw new RuntimeException("unknown surgeon");
        }
    }
}
