package emailApp;

public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email("Priya", "Augustin");
        email.setAlternateEmail("js@gmail.com");
//        System.out.println(email.getAlternateEmail());
////        email.setMailBoxCapacity(600);
//        System.out.println(email.getMailBoxCapacity());
        System.out.println(email.showInfo());
    }
}
