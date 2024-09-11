package Assignment_2;

public class Arrays_1 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		int sum = 0;
		//sum of an array
		for (int i = 0; i < array.length; i++) {
		    sum += array[i];
		}
		System.out.println("Sum: " + sum);
    }
}
