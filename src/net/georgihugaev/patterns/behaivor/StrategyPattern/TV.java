package net.georgihugaev.patterns.behaivor.StrategyPattern;

public class TV {
    Condition condition;

    public void setCondition(Condition condition) {
        this.condition = condition;
    }


    void doIt(){
        condition.act();
    }

}
