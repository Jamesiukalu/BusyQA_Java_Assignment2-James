package Assignment_2;

public class Strings_8 {
	public static void main(String[] args) {
		String greet = "hello James";
		char ch = 'e';
		int count = 0;
		for (int i = 0; i < greet.length(); i++) {
		    if (greet.charAt(i) == ch) {
		        count++;
		    }
		}
		System.out.println("Character '" + ch + "' repeated " + count + " times.");


	}
}
