package isp.lab6.exercise1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private HashMap<String, Integer> grades;
    private List<Student> students=new ArrayList<>();

    public Student(String name, int id, HashMap<String, Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public void addStudent(Student student) {
     students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public int getId() {
       return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(HashMap<String, Integer> grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void updateStudent(int id, String name, HashMap<String, Integer> grades) {
        for(Student student:students) {
            if(student.getId()==id) {
              student.setName(name);
              student.setGrades(grades);
              break;
            }
        }
    }
    public double averageGrade() {
        double s=0;
        double average=0;
        for(double grade : grades.values()) {
            s=s+grade;
        }
        average=s/grades.size();
        return average;
    }
    public void displayStudents() {
        for(Student student:students) {
            System.out.println(student.getId()+" "+student.getName()+" "+student.getGrades());
        }
    }
}
