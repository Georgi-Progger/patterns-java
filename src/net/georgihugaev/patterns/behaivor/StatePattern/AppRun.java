package net.georgihugaev.patterns.behaivor.StatePattern;

public class AppRun {
    public static void main(String[] args) {
        Condition condition = new Including();
        TV tv = new TV(condition);

        for (int i = 0;i < 6;i++){
            tv.doIt();
            tv.changeCondition();
        }
    }
}
