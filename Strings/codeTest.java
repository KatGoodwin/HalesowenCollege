
public class codeTest {

	public static void main (String [] args) {

		String testString = "abcdefg 123";

		System.out.println("code at index 3 " + testString.codePointAt(3));
		System.out.println("code at index 5 " + testString.codePointAt(5));
		System.out.println("code at index 7 " + testString.codePointAt(7));
		System.out.println("code at index 10 " + testString.codePointAt(10));

		int two =50;
		int ampersand = 38;
		int e = 101;

		char[] twoChar = Character.toChars(two);
		//you can convert this to a string if you need to, but we can 
		//just print the characters
		String twoString = String.valueOf(twoChar);
		System.out.println(twoString);
		System.out.println(Character.toChars(ampersand));
		System.out.println(Character.toChars(e));
		
	}
}




