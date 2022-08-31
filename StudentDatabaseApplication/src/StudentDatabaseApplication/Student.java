package StudentDatabaseApplication;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance=0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //    Constructor prompts user to add name and year
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student first name:");
        this.firstName = scan.nextLine();

        System.out.println("Enter student last name:");
        this.lastName = scan.nextLine();

        System.out.println("1 - Freshman\n2- Sophomore\n3 - Junior\n4 - Senior\nEnter Student Class level:");
        this.gradeYear = scan.nextInt();
        setStudentID();
//        System.out.println("Name: "+firstName + " " + lastName + "\tGrade Year: "+gradeYear + " Student ID: "+studentID);
    }

    //    Generate an ID
    private void setStudentID() {
//        GradeLevel + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

//    Enroll in Courses
    public void enroll(){
//        Get inside a loop, user hits 0
    do{
        System.out.print("Enter the course to enroll (Q to quit)");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if(!course.equals("Q")){
            courses = courses +"\n "+course;
            tuitionBalance = tuitionBalance+costOfCourse;
        }
        else{
            break;
        }
    }while (1!=0);
//        System.out.println("Enrolled Courses: "+courses);
//        System.out.println("Tuition Fess: "+tuitionBalance);
    }

//    View Balance
    public void viewBalance(){
        System.out.println("Your Balance is $"+tuitionBalance);
    }

//    Pay Tuition
    public void payTuition(){
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("How much do you like to pay now?");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance-payment;
        System.out.println("Thank you for payment of $"+payment);
        viewBalance();

    }

//    Show Status
//    public String showInfo(){
public String toString(){
    return "StudentID: "+studentID+ "\nName: "+firstName +" "+lastName+
            "\nGrade Level: "+gradeYear+"\nCourses Enrolled: "+courses+
                "\nBalance: $"+tuitionBalance;
    }
}
