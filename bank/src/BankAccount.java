public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int balances) {
        balance = balances;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    public Person getOwner() {
        return owner;
    }

    // 파라미터 : 입금할 액수 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean deposit(int amount) {
        if ((owner.getCashAmount() - amount) < 0 || amount < 0) {
            System.out.print("입금 실패입니다. ");
            System.out.print("잔고: " + balance + "원, ");
            System.out.println("현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            owner.setCashAmount(owner.getCashAmount() - amount);
            balance += amount;
            System.out.print(amount + "원 입금하였습니다.");
            System.out.print("잔고: " + balance + "원, ");
            System.out.println("현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

//    public boolean deposit(double amount, double exchangeRate) {
//        return deposit((int) (amount * exchangeRate));
//    }

    // 파라미터 : 출금할 액수 (정수)
    // 리턴 : 성공여부 (불린)
    boolean withdraw(int amount) {
        if ((balance - amount) < 0 || amount < 0) {
            System.out.print("출금 실패입니다. ");
            System.out.print("잔고: " + balance + "원, ");
            System.out.println("현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.print(amount + "원 출금하였습니다. ");
            System.out.print("잔고: " + balance + "원, ");
            System.out.println("현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

    // 첫 번째 파라미터 : 받는 사람 (Person)
    // 두 번째 파라미터 : 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
//    boolean transfer(Person to, int amount) {
//
//    }

    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    public boolean transfer (BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.getOwner().getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }
}
