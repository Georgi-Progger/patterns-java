package net.georgihugaev.patterns.SinglePattern;

public class Earth {
    private static Earth earth;
    private Integer width = 32;
    private Earth(){};
    public static synchronized Earth getEarth(){
        if (earth == null){
            earth =  new Earth();
        }
        return earth;
    }
    public void getWidth(){
        System.out.println(width);
    }

}