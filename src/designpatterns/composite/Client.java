package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

//Client
public class Client {

    public static void main(String[] args) {
        CompositeAccount component = new CompositeAccount();
        component.addAccount(new DepositAccount("DA001", 30));
        component.addAccount(new DepositAccount("DA001", 40));
        component.addAccount(new SavingAccount("SA001", 50));

        float totalBalance =  component.getBalance();
        System.out.println("Total Balance:: " +  totalBalance);

    }
}

//Composite
abstract class Account {
    public abstract float getBalance();
}

//Leaf
class DepositAccount extends Account {
    private String accountNo;
    private float accountBalance;

    public DepositAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public float getBalance() {
        return accountBalance;
    }
}

//Leaf
class SavingAccount extends Account {
    private String accountNo;
    private float accountBalance;

    public SavingAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public float getBalance() {
        return accountBalance;
    }
}

//Composite
class CompositeAccount extends Account {
    private List<Account> accountList;
    private float totalBalance;

    public CompositeAccount() {
        this.accountList = new ArrayList<>();
        ;
    }

    public float getBalance() {
        totalBalance = 0;
        for (Account f : accountList) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    public void addAccount(Account acc) {
        accountList.add(acc);
    }

    public void removeAccount(Account acc) {
        accountList.remove(acc);
    }
}



