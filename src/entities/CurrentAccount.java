package entities;

public class CurrentAccount extends Account {

    public CurrentAccount(Holder holder) {
        super(holder);
        super.balance = 100;
    }

    @Override
    public String toString (){
        return "Congratulations! Current Account has been created. Holder: "
                + super.getHolder().getName()
                + ". Account number: "
                + super.getNumber()
                + " . Agency: "
                + super.getAgency()
                + ". Balance: "
                + super.getBalance();
    }
}
