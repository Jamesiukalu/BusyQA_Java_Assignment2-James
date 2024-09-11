package Assignment_2;

public class Arrays_6 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 8, 3, 9, 14};
		
		for (int i = 0; i < array.length; i++) {
		    for (int j = i + 1; j < array.length; j++) {
		        if (array[i] == array[j]) {
		            System.out.println("Duplicate Element: " + array[i]);
		        }
		    }
		}

	}
}
