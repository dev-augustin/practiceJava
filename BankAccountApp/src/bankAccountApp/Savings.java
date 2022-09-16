package bankAccountApp;

public class Savings extends Account{
    //    List properties specific to Savings account
  private int safetyDepositBoxId;
   private int safetyDepositKey;

    //    Constructor to initialize settings for Savings account properties
    public Savings(String name, String ssn, double initialDeposit) {
        super(name, ssn, initialDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10,3));
       safetyDepositKey = (int) (Math.random()* Math.pow(10,4));

    }


    //    List any methods specific to the Savings account
public void showInfo(){
    System.out.println("Account type: SAVINGS");
    super.showInfo();
    System.out.println("Your savings account features: "+
            "\n Safety Deposit Box ID: "+safetyDepositBoxId+
            "\n Safety Deposit Box Key: "+safetyDepositKey);
}
}
