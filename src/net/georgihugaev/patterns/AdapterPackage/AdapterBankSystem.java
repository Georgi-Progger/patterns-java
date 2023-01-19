package net.georgihugaev.patterns.AdapterPackage;

public class AdapterBankSystem  extends BankSystem implements BankTerminal{
    @Override
    public void giveMoney() {
        getObject();
    }

    @Override
    public void addMoney() {
        addObject();
    }
}
