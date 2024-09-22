package Assignment_5;

public class exceptionHandling_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            int num = 10;
	            int result = num / 0; // This will throw ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero: " + e);
	        } finally {
	            System.out.println("Division attempt finished.");
	        }
	}

}
