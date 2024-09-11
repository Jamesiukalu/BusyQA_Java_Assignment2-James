package Assignment_2;

public class Arrays_5 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		
		int min = array[0], max = array[0];
		for (int i = 1; i < array.length; i++) {
		    if (array[i] < min) min = array[i];
		    if (array[i] > max) max = array[i];
		}
		System.out.println("Smallest: " + min);
		System.out.println("Greatest: " + max);

	}
}
