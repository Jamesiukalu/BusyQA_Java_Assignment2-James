package Assignment_2;

public class Arrays_2 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
		    sum += array[i];
		}
		//average of an array:
		double average = (double) sum / array.length;
		System.out.println("Average: " + average);

    }
}
