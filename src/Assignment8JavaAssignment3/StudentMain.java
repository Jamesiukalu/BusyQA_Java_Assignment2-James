package Assignment8JavaAssignment3;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating objects of Student class
        Student stu1 = new Student();
        Student stu2 = new Student();

        // Setting data for stu1
        stu1.getStuData(101, "James");
        stu1.getStuMarks(80, 90, 85);
        stu1.totalMarks();

        // Setting data for stu2
        stu2.getStuData(102, "Sophia");
        stu2.getStuMarks(75, 85, 80);
        stu2.totalMarks();
	}

}
