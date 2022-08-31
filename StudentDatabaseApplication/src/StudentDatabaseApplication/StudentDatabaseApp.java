package StudentDatabaseApplication;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

//        Student student = new Student();
//        student.enroll();
//        student.payTuition();
////        System.out.println(student.showInfo());
//        System.out.println(student.toString());


        //    Ask how many students we want to add
        System.out.println("How many Students you want to enroll");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];


//    Create n number of students
        for(int n=0; n<numOfStudents;n++){
           students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }
//        System.out.println(students[0].toString());
//        System.out.println(students[1].toString());
        for(int n=0; n<numOfStudents;n++){
            System.out.println(students[n].toString());
        }
    }


}
