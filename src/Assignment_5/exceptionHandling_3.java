package Assignment_5;

public class exceptionHandling_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            validateAge(19); // This will throw the custom exception
        } catch (UserDefinedException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws UserDefinedException {     // Step 2: Method that throws custom exception
        if (age < 18) {
            throw new UserDefinedException("Age must be 18 or above to vote.");
        }
        System.out.println("Eligible to vote.");
	}

}
