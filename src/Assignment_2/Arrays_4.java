package Assignment_2;

public class Arrays_4 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		int[] incompleteArray = {1, 2, 3, 4, 9, 14}; // Example: 8 removed
		
		int expectedSum = 0;
		for (int i = 0; i < array.length; i++) {
		    expectedSum += array[i];
		}

		int actualSum = 0;
		for (int j = 0; j < incompleteArray.length; j++) {
		    actualSum += incompleteArray[j];
		}
		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing Number: " + missingNumber);

	}
}
