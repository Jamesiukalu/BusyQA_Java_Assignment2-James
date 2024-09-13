package Assignment8JavaAssignment3;

public class CalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating object of Calculation class
		Calculation cal = new Calculation();

        // Calling methods with different inputs
        System.out.println("Sum of 2 integers: " + cal.sum(6, 25));
        System.out.println("Sum of 3 integers: " + cal.sum(32, 21, 19));
        System.out.println("Sum of 2 doubles: " + cal.sum(10.2, 30.6));
        System.out.println("Sum of 3 doubles: " + cal.sum(10.5, 50.5, 40.5));
	}

}
