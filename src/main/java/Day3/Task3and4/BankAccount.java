package Day3.Task3and4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if(amount > 5000) {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
        } else {
            this.balance = getBalance() + amount;
        }
    }

    public boolean withdraw(double amount){
        boolean withdrawStatus;
        if(amount > this.balance){
            System.out.println("There is not enough funds !");
            withdrawStatus = false;
        } else  {
            this.balance = getBalance() - amount;
            withdrawStatus = true;
        };
        return withdrawStatus;
    }

    public void printBalance(){
        System.out.println("Total balance : " + this.balance);
    }
}
