public class BankAccount{

    //State variables
    String owner;
    double balance;
    boolean isFrozen;


    //Method or behavior to deposit
    public void deposit(double amount){
        if(isFrozen == true){
            System.out.println("Cannot deposit amount due to frozen account.");
            return;
        }
        if(amount<0){
            System.out.println("Cannot deposit amount due to insufficient balance in the account.");
            return;
        }

        balance += amount;
        System.out.println("Deposited" + amount + "new balance" + balance);
    }

    //Method or behavior to withdraw
    public void withdraw(double amount){
          if(isFrozen == true){
            System.out.println("Cannot withdraw amount due to frozen account.");
            return;
        }
        if(amount<0){
            System.out.println("Cannot withdraw amount due to insufficient balance in the account.");
            return;
        }
        if(amount>balance){
            System.out.println("Insufficient funds. Cannot withdraw.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawn" + amount + "new balance" + balance);
    }

    public class Main{
        public static void main(String args[]){

            // Creating my Account
            BankAccount myAccount = new BankAccount();
            myAccount.owner = "Bhawna";
            myAccount.balance = 1500;
            myAccount.isFrozen = false;

            //Creating Friend's account
            BankAccount friendAccount = new BankAccount();
            friendAccount.owner = "Tanisha";
            friendAccount.balance = 1000;
            friendAccount.isFrozen = true;

            //Testing my account
            System.out.println("Testing my account");
            myAccount.deposit(2000);
            myAccount.withdraw(1000);


            //Testing friend's account
            System.out.println("Testing friend's account");
            friendAccount.withdraw(500);
        }
    }

}