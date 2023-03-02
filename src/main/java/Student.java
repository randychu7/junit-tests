import java.util.ArrayList;

public class Student {

//- `id` should be a `long` number used to represent a "unique user" in our application.
//- `name` is a `String` that holds the name of the student.
//- `grades` is an `ArrayList` that contains a list of `Integer` numbers.

    private long studentId;
    private String name;
    private ArrayList<Integer>grades;

    public Student(long studentId, String name, ArrayList<Integer> grades) {
        this.studentId = studentId;
        this.name = name;
        this.grades = grades;
    }

    //Getters
    public long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    //Setters
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

//    // returns the student's id
//    public long getId(){...}
//
//    // returns the student's name
//    public String getName(){...}
//
//    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }
//
//    // returns the list of grades
//    public ArrayList<Integer> getGrades(){
//        for(int grade : grades){
//        }
//    }
////
//    // returns the average of the students grades
//    public double getGradeAverage(){...}


//Get average grade
    public double getAverageGrades(){
        double total = 0;
        for (int grade : grades){
            total += grade;
        }
        return total/grades.size();
    }

}
