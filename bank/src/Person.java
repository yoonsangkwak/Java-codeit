public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String name, int age, int cashAmount) {
        this.name = name;
        if (age < 0) {
            this.age = 12;
        } else {
            this.age = age;
        }
        if (cashAmount < 0) {
            this.cashAmount = 0;
        } else {
            this.cashAmount = cashAmount;
        }
    }

    public Person(String pName, int pAge) {
        name = pName;
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }
        cashAmount = 0;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCashAmount(int cashAmount) {
        if (cashAmount >= 0) {
            this.cashAmount = cashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setBankAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
