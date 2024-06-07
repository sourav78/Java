public class Q8Bank {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount();
        account.deposit(2500);
        account.printBalance();
        account.withdrawal(2550);
        account.printBalance();
    }
}

class SavingAccount extends BankAccount {
    @Override
    void withdrawal(double amount) {
        if (amount > balance){
            System.out.println("Insufficient balance");
        }else {
            if (balance > 100){
                super.withdrawal(amount);
            }else {
                System.out.println("Can not withdrawal money bellow 100.");
            }
        }
    }
}

class BankAccount{
    double balance;

    void deposit(double amount){
        balance = balance + amount;
    }

    void withdrawal(double amount){
        balance -= amount;
    }

    void printBalance(){
        System.out.println(balance);
    }
}
