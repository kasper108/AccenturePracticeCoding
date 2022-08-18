package Day3.Task3and4;

public class Main {
    public static void main(String[] args) {

        MoneyTransferringBetweenAccounts moneyTransferringBetweenAccounts = new MoneyTransferringBetweenAccounts();

        BankAccount ba1 = new BankAccount(200);
        BankAccount ba2 = new BankAccount(300);

        ba1.deposit(100);
        ba1.withdraw(50);
        ba1.deposit(5001);

        ba2.deposit(1000);
        ba2.withdraw(500);

        moneyTransferringBetweenAccounts.transferMoneyFromAccountToOtherAccount(300, ba1 ,ba2);
        moneyTransferringBetweenAccounts.transferMoneyFromAccountToOtherAccount(300, ba2 ,ba1);

        ba1.printBalance();
        ba2.printBalance();
    }
}
