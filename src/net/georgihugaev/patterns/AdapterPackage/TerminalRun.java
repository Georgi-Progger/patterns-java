package net.georgihugaev.patterns.AdapterPackage;

public class TerminalRun {
    public static void main(String[] args) {
        BankTerminal bankTerminal = new AdapterBankSystem();

        bankTerminal.addMoney();
        bankTerminal.giveMoney();
    }
}
