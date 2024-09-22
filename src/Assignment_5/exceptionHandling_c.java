package Assignment_5;

public class exceptionHandling_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            int[] arr = {1, 2, 3};
	            int value = arr[5]; // This will throw ArrayIndexOutOfBoundsException
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Index out of bounds: " + e);
	        } finally {
	            System.out.println("Array access attempt finished.");
	        }
	}

}
