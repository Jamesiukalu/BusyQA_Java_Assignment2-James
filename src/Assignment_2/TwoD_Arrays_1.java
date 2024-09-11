package Assignment_2;

public class TwoD_Arrays_1 {
	public static void main(String[] args) {
		//Write a Java program to find the average score of two students in three papers using 2-dimensional array.
		
		int[][] scores = {{85, 90, 80}, {78, 85, 88}};
		
		for (int i = 0; i < scores.length; i++) {
		    int total = 0;
		    
		    for (int j = 0; j < scores[i].length; j++) {
		        total += scores[i][j];
		    }
		    double average = total / 3.0;
		    System.out.println("Average score of Student " + (i + 1) + ": " + average);
		}

	
	}
}
