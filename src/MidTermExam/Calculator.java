package MidTermExam;

class Calculator {

    public float add(float a, float b) {
        return a + b; // addition
    }

    public float subtract(float a, float b) {
        return a - b; // subtraction
    }

    public float multiply(float a, float b) {
        return a * b; // multiplication
    }

    public float divide(float a, float b) { // divide
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }
}
