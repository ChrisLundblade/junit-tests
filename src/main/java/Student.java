import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long studentID) {
        this.name = name;
        this.id=studentID;
        this.grades = new ArrayList<>();
    }
    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage(){
        double gradeTotal = 0.00;
        for(Integer grade : grades){
            gradeTotal+=grade;
        }
        return gradeTotal/grades.size();
    }
}
