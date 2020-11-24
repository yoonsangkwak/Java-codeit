public class TransferLimitAccount extends BankAccount {
    private int transferLimit;

    @Override
    public boolean withdraw(int amount) {
        if (amount > transferLimit) {
            return false;
        }

        return super.withdraw(amount);
    }

    public TransferLimitAccount(int balance, int transferLimit) {
        super(balance);
        this.transferLimit = transferLimit;
    }
}
