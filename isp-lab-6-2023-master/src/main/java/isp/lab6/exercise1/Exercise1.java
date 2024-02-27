package isp.lab6.exercise1;

import java.util.HashMap;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<String, Integer> grades=new HashMap<>();
        grades.put("Matematica",8);
        grades.put("Romana",7);
        grades.put("Informatica",9);
        Student student1 = new Student("Maria",2344,grades);
        student1.addStudent(student1);
        student1.displayStudents();
        student1.updateStudent(2344,"Ana",grades);
        student1.displayStudents();
        System.out.println(student1.averageGrade());
    }
}
