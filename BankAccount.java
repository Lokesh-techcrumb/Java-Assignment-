public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Successfully Deposited.Total Balance is " + balance);
        }
        else{
            System.out.println("Please deposit valid amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Amount Successfully Withdrawn. Remaining Balance is " + balance);
        }
        else if(amount > balance){
            System.out.println("Insufficient Balance. Withdrawing amount is failed");
        }
        else{
            System.out.println("Please Withdrawn valid amount");
        }
    }

    public double getBalance(){
        return balance;
    }


    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Lokesh", 1000);

        System.out.println("Initial Balance " + account.getBalance());

        account.deposit(1000);

        account.withdraw(500);

        account.withdraw(2000);

        System.out.println("Final Balance " + account.getBalance());
    }
}