package bankAccountApp;

public class Checking extends Account{
//    List properties specific to checking account
    private int debitCardNumber;
   private int debitCardPin;

//    Constructor to initialize checking account properties
    public Checking(String name, String ssn, double initialDeposit){
        super(name, ssn, initialDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    //    List any methods specific to the checking account
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin =(int) (Math.random() * Math.pow(10,4));
}
public void showInfo(){

    System.out.println("Account type: CHECKING");
    super.showInfo();
    System.out.println("Your checking account features: "+
            "\n Debit Card Number: "+debitCardNumber+
            "\n Debit Card PIN: "+debitCardPin);
}
}
