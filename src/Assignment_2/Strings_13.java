package Assignment_2;

public class Strings_13 {
	public static void main(String[] args) {
		String str = "madam";
		String reversed = new StringBuilder(str).reverse().toString();
		if (str.equals(reversed)) {
		    System.out.println("Palindrome");
		} else {
		    System.out.println("Not a palindrome");
		}

	}
}
