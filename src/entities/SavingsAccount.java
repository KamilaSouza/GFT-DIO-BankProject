package entities;

public class SavingsAccount extends Account {

    public SavingsAccount(Holder holder) {
        super(holder);
        super.balance = 50;
    }

    @Override
    public String toString (){
        return "Congratulations! Savings Account has been created. Holder: "
                + super.getHolder().getName()
                + ". Account number: "
                + super.getNumber()
                + " . Agency: "
                + super.getAgency()
                + ". Balance: "
                + super.getBalance();
    }
}
