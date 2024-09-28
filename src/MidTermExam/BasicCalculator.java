package MidTermExam;

import java.util.Scanner;

public class BasicCalculator extends Calculator {
   
    public int add(int a, int b, int c) {  // Overloaded add method for integer parameters
        return a + b + c;
    }

    public float add(float a, float b) {     // Overloaded add method for two float parameters (inherited)
        return super.add(a, b); // Call parent add method
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new BasicCalculator();

        System.out.println("Enter first number: ");
        float num1 = scanner.nextFloat();

        System.out.println("Enter second number: ");
        float num2 = scanner.nextFloat();

        System.out.println("Select operation (+, -, *, /): ");
        char calculation = scanner.next().charAt(0);

        float result = 0;
        boolean validCalcluation = true;

        switch (calculation) {
            case '+':
                result = calc.add(num1, num2);
                break;
            case '-':
                result = calc.subtract(num1, num2);
                break;
            case '*':
                result = calc.multiply(num1, num2);
                break;
            case '/':
                try {
                    result = calc.divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    validCalcluation = false;
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                validCalcluation = false;
                break;
        }

        if (validCalcluation) {
            System.out.println("Result: " + result);
        }

        // Part B: Scientific Calculator Operations
        System.out.println("---- Scientific Calculator ----");
        ScientificCalculator sciCalc = new ScientificCalculator();
        
        System.out.print("Enter a number for square or cube calculation: ");
        float sciNum = scanner.nextFloat();
        
        System.out.print("Select calculation (square/cube/addition/subtract/multiply/divide): ");
        String calulation2 = scanner.next().toLowerCase();

        switch (calulation2) {
            case "square":
                result = sciCalc.square(sciNum);
                System.out.println("Square of " + sciNum + " is: " + result);
                break;
            case "cube":
                result = sciCalc.cube(sciNum);
                System.out.println("Cube of " + sciNum + " is: " + result);
                break;
            case "addition":
                System.out.print("Enter another number: ");
                float addNum = scanner.nextFloat();
                result = sciCalc.add(sciNum, addNum);
                System.out.println("Result of addition: " + result);
                break;
            case "subtract":
                System.out.print("Enter another number: ");
                float subNum = scanner.nextFloat();
                result = sciCalc.subtract(sciNum, subNum);
                System.out.println("Result of subtraction: " + result);
                break;
            case "multiply":
                System.out.print("Enter another number: ");
                float mulNum = scanner.nextFloat();
                result = sciCalc.multiply(sciNum, mulNum);
                System.out.println("Result of multiplication: " + result);
                break;
            case "divide":
                System.out.print("Enter another number: ");
                float divNum = scanner.nextFloat();
                try {
                    result = sciCalc.divide(sciNum, divNum);
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        System.out.println("---- Basic Calculator with Overloaded Add ----");    // Part B: Basic Calculator with overloaded add
        BasicCalculator Calc = new BasicCalculator();

        System.out.print("Enter three integers for addition: ");
        int intNum1 = scanner.nextInt();
        int intNum2 = scanner.nextInt();
        int intNum3 = scanner.nextInt();
        
        int sumResult = Calc.add(intNum1, intNum2, intNum3);
        System.out.println("Sum of three integers: " + sumResult);

        System.out.print("Enter two float numbers to add: ");        // Add two numbers
        float fNum1 = scanner.nextFloat();
        float fNum2 = scanner.nextFloat();
        
        float floatSumResult = Calc.add(fNum1, fNum2);
        System.out.println("Sum of two float numbers: " + floatSumResult);

        scanner.close(); // Close
    }
}
