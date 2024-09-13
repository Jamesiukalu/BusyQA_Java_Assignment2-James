package Assignment8JavaAssignment3;

public class CalculatorMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating object and calling constructor
		Calculator calc = new Calculator(10, 20, 30);
        // Calling sum method
        int result = calc.sum();
        System.out.println("Sum: " + result);
    }
}
