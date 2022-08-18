package Day3.Task3and4;

public class MoneyTransferringBetweenAccounts {
    public void transferMoneyFromAccountToOtherAccount(double amount , BankAccount fromAccount, BankAccount toAccount){
        if(fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
        } else {
            System.out.println("Transfer canceled. You are trying to transfer " + amount + "" +
                    " units, but only " + fromAccount.getBalance() + " are available ");
        };
    }
}
