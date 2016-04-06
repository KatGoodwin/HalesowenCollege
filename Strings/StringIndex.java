


public class StringIndex{

	public static void main(String [] args){
		String demo = "kgoodwin@halesowen.ac.uk";
		int index = demo.indexOf('@');
		System.out.println("@ character is at " + index + 
			" in the string " + demo);

		int indexFail = demo.indexOf('$');
		System.out.println("We can't find $ in the string so we get " 	
				+ indexFail);

		int goodindex = demo.indexOf("goodwin");
		System.out.println("'goodwin' can be found at index " +
			 goodindex + " in the string " + demo);
	}
	

}



