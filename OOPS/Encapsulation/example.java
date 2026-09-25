
class BankAccount {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class example {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setBalance(5000);

        System.out.println(account.getBalance());
    }
}
//       BankAccount
//    ┌─────────────────┐
//    │ private balance │ 🔒
//    │                 │
//    │ deposit()       │
//    │ withdraw()      │
//    │ getBalance()    │
//    └────────┬────────┘
//             │
//       Controlled Access
//             │
//             ▼
    //       Other classes
