package emailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
//Best practice - Encapsulation -making all this private. So people can't access these fields directly. Access this
// info through class API
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength=15;
    private String alternateEmail;
    private String companySuffix = "abccompany.com";

//    Constructor to receive first name and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        //    Call a method asking for department and return the department
        this.department = setDepartment();
        //    Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+ this.password);
        //    Combine elements to generate email
        email= firstName.toLowerCase()+ "."+ lastName.toLowerCase()+ "@"+department.toLowerCase() + "."+ companySuffix;

    }
//    Ask for the department
    private String setDepartment(){
        System.out.println("New Worker: " + firstName + ". \nDepartment Codes:\n1 for Sales\n2 for Development\n3 for" +
                " Accounting\n4 " +
                "None\nEnter the Department code: ");
        Scanner scan = new Scanner(System.in);
        int departmentChoice = scan.nextInt();
        if(departmentChoice == 1){
            return "Sales";
        } else if (departmentChoice==2) {
            return "Dev";
        } else if (departmentChoice==3) {
            return "Acct";
        }else {
            return "";
        }
    }

//    Generate random Password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

//    Set Mailbox Capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
        System.out.println("MailBoxCapacity: "+this.mailBoxCapacity);
    }

//    Set alternate email
    public void setAlternateEmail(String atlEmail) {
        this.alternateEmail = atlEmail;
    }
//    Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name: "+ firstName + " " +lastName +
                "\nCompany Email: "+email + " "+
                "\nMailBox Capacity: " +mailBoxCapacity+ "mb";
    }
}
