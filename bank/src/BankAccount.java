public class BankAccount {
    int balance;
    Person owner;

    // 파라미터 : 입금할 액수 (정수)
    // 리턴 : 성공여부 (불린)
    boolean deposit(int amount) {
        if ((owner.cashAmount - amount) < 0 || amount < 0) {
            System.out.print("입금 실패입니다. ");
            System.out.print("잔고: " + balance + "원, ");
            System.out.println("현금: " + owner.cashAmount + "원");
            return false;
        } else {
            owner.cashAmount -= amount;
            balance += amount;
            System.out.print(amount + "원 입금하였습니다.");
            System.out.print("잔고: " + balance + "원, ");
            System.out.println("현금: " + owner.cashAmount + "원");
            return true;
        }
    }

    // 파라미터 : 출금할 액수 (정수)
    // 리턴 : 성공여부 (불린)
    boolean withdraw(int amount) {
        if ((balance - amount) < 0 || amount < 0) {
            System.out.print("출금 실패입니다. ");
            System.out.print("잔고: " + balance + "원, ");
            System.out.println("현금: " + owner.cashAmount + "원");
            return false;
        } else {
            balance -= amount;
            owner.cashAmount += amount;
            System.out.print(amount + "원 출금하였습니다. ");
            System.out.print("잔고: " + balance + "원, ");
            System.out.println("현금: " + owner.cashAmount + "원");
            return true;
        }
    }

    // 첫 번째 파라미터 : 받는 사람 (Person)
    // 두 번째 파라미터 : 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
//    boolean transfer(Person to, int amount) {
//
//    }
}
