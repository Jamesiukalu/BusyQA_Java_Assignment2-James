package Assignment_5;

public class exceptionHandling_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            int[] a = null;
            int length = a.length; // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Array is null, cannot access length: " + e);
        } finally {
            System.out.println("Null check attempt finished.");
        }
	}

}
