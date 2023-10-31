import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment 2");
        //declaration part:
        Scanner sc= new Scanner(System.in);
        String name;
        double assignment1,assignment2;
        Course[] courses = new Course[2];
        Student[] javaStudents = new Student[2]; //array of student objects
        Student[] pythonStudents = new Student[2]; //array of student objects
        double totalAssignment1=0, totalAssignment2=0;
        double assignment1Average;
        double assignment2Average;
        /*
    Programming IT Courses
    COURSE ENTRY
    ================================
    Enter name for course # 1:
    Java Programming
    Enter name for course # 2:
    Python Programming

         */
        System.out.println("Programming IT Courses");
        System.out.println("Course Entry");
        printTheLine();
        for (int i = 0; i < courses.length; i++) {
            System.out.println(String.format("Enter name for course # %d:",i+1));
            name = sc.nextLine();
            while(name.length() < 3) {
                System.out.println("INVALID");
                name = sc.nextLine();
            }
            courses[i] = new Course(name);
        }

        //JAVA STUDENT INPUT-----------------------------------------------------------
        System.out.println("enter Students for java programming: ");
        for (int i = 0; i < javaStudents.length; i++) {
            System.out.println(String.format("enter name for student # %d:",i+1));
            name = sc.nextLine();
            while(name.length() < 3) {
                System.out.println("INVALID");
                name = sc.nextLine();
            }
            System.out.println(String.format("enter assignment 1 mark for %S: ",
                    name));
            assignment1 = sc.nextDouble();
            while (assignment1 > 100 || assignment1 < 0) {
                System.out.println("INVALID");
                assignment1 = sc.nextDouble();
            }
            System.out.println(String.format("enter assignment 2 mark for %S: ",
                    name));
            assignment2 = sc.nextDouble();
            while (assignment2 > 100 || assignment2 < 0){
                System.out.println("INVALID");
                assignment2 = sc.nextDouble();
            }
            sc.nextLine();
            javaStudents[i] = new Student(name, assignment1, assignment2);
            //calculating the total mark of assignment1 for all 6 students:
            totalAssignment1 += assignment1;
            //calculating the total mark of assignment2 for all 6 students:
            totalAssignment2 += assignment2;
        }
        //PYTHON STUDENT INPUT--------------------------------------------------------
        System.out.println("enter Students for python programming: ");
        for (int i = 0; i < pythonStudents.length; i++) {
            System.out.println(String.format("enter name for student # %d:",i+1));
            name = sc.nextLine();
            while(name.length() < 3){
                System.out.println("INVALID");
                name = sc.nextLine();
            }
            System.out.println(String.format("enter assignment 1 mark for %S: ",
                    name));
            assignment1 = sc.nextDouble();
            while (assignment1 > 100 || assignment1 < 0) {
                System.out.println("INVALID");
                assignment1 = sc.nextDouble();
            }
            System.out.println(String.format("enter assignment 2 mark for %S: ",
                    name));
            assignment2 = sc.nextDouble();
            while (assignment2 > 100 || assignment2 < 0){
                System.out.println("INVALID");
                assignment2 = sc.nextDouble();
            }
            sc.nextLine();
            pythonStudents[i] = new Student(name, assignment1, assignment2);
            //calculating the total mark of assignment1 for all of the 6 students:
            totalAssignment1 += assignment1;
            //calculating the total mark of assignment2 for all of the 6 students:
            totalAssignment2 += assignment2;
        }
        assignment1Average = totalAssignment1/6;
        assignment2Average = totalAssignment2/6;
        courses[0].assignment1Average = assignment1Average;
        courses[0].assignment2Average = assignment2Average;
        courses[0].coursesAverage = (assignment1Average + assignment2Average)/2;

        assignment1Average = totalAssignment1/6;
        assignment2Average = totalAssignment2/6;
        courses[1].assignment1Average = assignment1Average;
        courses[1].assignment2Average = assignment2Average;
        courses[1].coursesAverage = (assignment1Average + assignment2Average)/2;


        /*
        REPORT: Stats per Course
        ================================
        Java Programming : Assignment1 – 70	Assignment2 – 80		Average - 75	Course Rating: C
         */
        System.out.println("REPORT: Stats per Course");
        printTheLine();
        System.out.println(courses[0].coursesReport());
        System.out.println(courses[1].coursesReport());

        /*
        Report: stats per student
        ================================
         */
        System.out.println("Report: stats per student");
        printTheLine();
        System.out.println(courses[0].coursesName);
        for (int i = 0; i < javaStudents.length; i++) {
            System.out.println(javaStudents[i].stdReport());

        }
        System.out.println(courses[1].coursesName);
        for (int i = 0; i < pythonStudents.length; i++) {
            System.out.println(pythonStudents[i].stdReport());

        }
    }
    //the other methods in the scope of main class.
    public static void printTheLine(){
        System.out.println("=".repeat(40));
    }


}