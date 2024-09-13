package Assignment8JavaAssignment3;

public class Calculator {
    // Variables
    int num1, num2, num3;
    
    // Constructor to initialize variables
    Calculator(int n1, int n2, int n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    // Method to calculate sum of three numbers
    int sum() {
        return num1 + num2 + num3;
}
}