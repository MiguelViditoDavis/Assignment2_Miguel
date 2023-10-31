public class Course {
//Atttributes:
    String coursesName;
    double assignment1Average;
    double assignment2Average;
    double coursesAverage;

    //Constructor(s):
    public Course(String coursesName){
        this.coursesName = coursesName;
        this.coursesAverage = (assignment1Average + assignment2Average)/2;
    }

    //Methods:
    /*
    o	The course rating is calculated using the following formula:
	A – If the average of assignment1 and assignment 2 is greater than or equal 90.
	B – If the average of assignment1 and assignment 2 is greater than or equal to 80 AND less than 90
	C – If the average of assignment1 and assignment 2 is greater than or equal 70 AND less than 80
	D – If the average of assignment1 and assignment 2 is greater than or equal 60 AND less than 70
	F – If the average of assignment1 and assignment 2 is less than 60

     */
    public String courseRating(){
        String rate;
        if (this.coursesAverage >=90)
            rate = "A";
        else if (this.coursesAverage >=80)
            rate = "B";
        else if (this.coursesAverage >=70)
            rate = "C";
        else if (this.coursesAverage >=60)
            rate = "D";
        else
            rate = "F";
        return rate;

    }
    public String coursesReport(){
        //Java Programming : Assignment1 – 70	Assignment2 – 80		Average - 75	Course Rating: C
        String coursesReport = String.format("%s : Assignment1 – %.2f Assignment2 – %.2f Average - %.2f\n" +
                        "Course Rating: %s.",
                this.coursesName,this.assignment1Average,this.assignment2Average, this.coursesAverage,courseRating());
        return coursesReport;
    }
}
