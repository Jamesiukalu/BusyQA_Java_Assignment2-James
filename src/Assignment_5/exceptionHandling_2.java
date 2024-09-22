package Assignment_5;
import java.io.*;

public class exceptionHandling_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            methodThatThrowsException();
	        } catch (IOException e) {
	            System.out.println("Caught the exception: " + e);
	        }
	    }

	    public static void methodThatThrowsException() throws IOException {
	        // Simulating a checked exception
	        throw new IOException("This is a checked exception");
	}

}
