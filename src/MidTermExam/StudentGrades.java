package MidTermExam;
import java.util.HashMap;

import java.util.Map;

public class StudentGrades {

    public HashMap<String, Double> gradesMap;    // HashMap to store names and grades

    public StudentGrades() {
        gradesMap = new HashMap<>();
    }

    public void addGrade(String studentName, Double grade) {     // Method to add a new student and grade
        gradesMap.put(studentName, grade);
    }

    public Double getGrade(String studentName) {     // Method to retrieve grade given their name
        return gradesMap.get(studentName);
    }

    public void removeStudent(String studentName) {     // Method to remove a student from the map
        gradesMap.remove(studentName);
    }

    public void printAllGrades() {     // Method to print all students and their grades
        System.out.println("Student Grades:");
        for (Map.Entry<String, Double> entry : gradesMap.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
