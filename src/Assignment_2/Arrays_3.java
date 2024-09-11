package Assignment_2;

public class Arrays_3 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		System.out.println("Even Numbers:");
		for (int i : array) {
		    if (i % 2 == 0) {
		        System.out.println(i); // print even numbers in an array.
		    }
		}

		System.out.println("Odd Numbers:");
		for (int i : array) {
		    if (i % 2 != 0) {
		        System.out.println(i); // print odd numbers in an array.
		    }
		}

    }
}
