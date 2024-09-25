package Assignment_4;

public class Calculation implements InterfaceA, InterfaceB {

	@Override
	public void mul() {
		// TODO Auto-generated method stub
        int result = a + b;
        System.out.println("Addition of a & b: " + result);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
        int result = x * y;
        System.out.println("Multiplication of x & y: " + result);
	}

}
