package MidTermExam;

public class StudentMain {
    public static void main(String[] args) {

        StudentGrades studentGrades = new StudentGrades();

        studentGrades.addGrade("James", 90.5);
        studentGrades.addGrade("Oge", 90.0);
        studentGrades.addGrade("Jackie", 79.0);

        String PrintSpecificStudent = "Oge";   // Retrieve and print the grade ofOge 
            System.out.println(PrintSpecificStudent + " is not found.");

        studentGrades.removeStudent("Jackie");   // Remove Jackie and print others
        studentGrades.printAllGrades();
    }
}
