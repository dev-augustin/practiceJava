package bankAccountApp;

public class BankAccountApp {
    public static void main(String[] args){
 Checking checkAcc1 = new Checking("Priya Augustin", "123456789", 1000);
 Savings savingAcc1 = new Savings("Priya Yuvaraj", "987654321", 2000);
        savingAcc1.compound();
 savingAcc1.showInfo();

        System.out.println("*******************");
 checkAcc1.showInfo();

//
// savingAcc1.deposit(5000);
// savingAcc1.withdraw(100);
// savingAcc1.transfer("Brokerage", 2000);


//        Read a CSV file then create new accounts based on that data
    }
}
