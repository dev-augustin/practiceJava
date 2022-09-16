package bankAccountApp;

public abstract class Account implements IBaseRate{
    //    List common properties for savings and checking account
   private String name;
   private String ssn;
   private double balance;
   private static int index = 10000;
   protected String accountNumber;
   protected double rate;

//    Constructor to set base properties and initialize the account
public Account(String name, String ssn, double initialDeposit){
    this.name = name;
    this.ssn = ssn;
    balance = initialDeposit;
    index++;
    this.accountNumber = setAccountNumber();
    setRate();
}

public abstract void setRate();
private String setAccountNumber(){
    String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
    int uniqueID = index;
    int randomNumber = (int)  (Math.random()* Math.pow(10,3));
    return lastTwoOfSSN + uniqueID + randomNumber;
}

public void compound(){
    double accruedInterest = balance * (rate/100);
    balance = balance +accruedInterest;
    System.out.println("Accrued Interest: $"+ accruedInterest);

    printBalance();
}
//    List common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing amount: $"+amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing amount: $"+amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance= balance-amount;
        System.out.println("Transferring $"+amount +" to "+ toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now: $"+ balance);
    }
    public void showInfo(){
        System.out.println(
                "Name: " +name+
                        "\nAccount Number: " +accountNumber+
                "\nBalance: " +balance + "\nRate: "+rate+ "%"

        );
    }
}

// Abstract class - we cannot create objects from the class
// Abstract Method - We do not define anything inside abstract method but forcing the class which inherits acocunt to
// implement the abstract method