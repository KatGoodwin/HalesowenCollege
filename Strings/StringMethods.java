

public class StringMethods {

	public static void main (String [] args){

		String name = "Fred Smith";

		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		if (name.startsWith("Fred")){
			System.out.println("This name starts with Fred");

		}
		if(!name.endsWith("Jones")){
			System.out.println("This name doesn't end with Jones");
		}
	}

}


