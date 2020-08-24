public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
        Person p1 = new Person();
        p1.setName("김신의");
        p1.setAge(28);
        p1.setCashAmount(30000);

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

        p1.setBankAccount(a1);
        a1.owner = p1;

        Person p2 = new Person();
        p2.setName("곽윤상");
        p2.setAge(25);
        p2.setCashAmount(100000);

        BankAccount a2 = new BankAccount();
        a2.balance = 500000;

        p2.setBankAccount(a2);
        a2.owner = p2;

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));
    }
}
