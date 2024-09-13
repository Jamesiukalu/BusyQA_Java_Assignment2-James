package Assignment8JavaAssignment3;

public class Student {
    // Variables
    int SID;
    String Sname;
    int Sub1, Sub2, Sub3;
    
    // Method to set student data
    void getStuData(int sid, String sname) {
        SID = sid;
        Sname = sname;
    }
    
    // Method to set student marks
    void getStuMarks(int sub1, int sub2, int sub3) {
        Sub1 = sub1;
        Sub2 = sub2;
        Sub3 = sub3;
    }
    // Method to calculate total marks and print details
    void totalMarks() {
        int total = Sub1 + Sub2 + Sub3;
        System.out.println("Student ID: " + SID);
        System.out.println("Student Name: " + Sname);
        System.out.println("Total Marks: " + total);
    }
}
