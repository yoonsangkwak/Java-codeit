public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount(int balance) {
        super(balance);
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void addInterest() {
        // balance = (int) (balance * (1 + interest));
        setBalance((int) (getBalance() * (1 + interest)));
    }
}
