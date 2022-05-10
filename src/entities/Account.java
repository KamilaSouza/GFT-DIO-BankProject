package entities;

import lombok.Getter;
@Getter
public abstract class Account { //can not be instantiated

    private static final int AGENCY = 0;
    private static int SEQUENTIAL = 1;
    private Holder holder;
    private int agency;
    private int number;
    protected double balance;

    public Account(Holder holder) {
        this.agency = 1;
        this.number = SEQUENTIAL++;
        this.holder = holder;
    }

    public void deposit(double value) {
        this.balance = balance + value;
    }

    public void withdraw(double value)  {
        if (balance - value < 0) {
            System.out.println("Insufficient balance! Your balance is: " + balance);
        } else {
            this.balance = balance - value;
        }
    }

    public void transfer(double value, Account recipientAccount) {
        this.withdraw(value);
        recipientAccount.deposit(value);
    }

    public String toString() {
        return "Congratulations! Account has been created. Holder: "
                + this.holder.getName()
                + ". Account number: "
                + this.number
                + " . Agency: "
                + this.agency
                + ". Balance: "
                + this.balance;
    }
}
