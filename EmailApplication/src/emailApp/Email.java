package emailApp;

public class Email {
//Best practice - Encapsulation -making all this private. So people can't access these fields directly. Access this
// info through class API
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

//    Constructor to receive first name and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
//    Ask for the department
//    Generate random Password
//    Set alternate email
//    Set Mailbox Capacity
//    Change the password
}
