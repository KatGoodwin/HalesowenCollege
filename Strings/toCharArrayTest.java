public class toCharArrayTest {


	public static void main(String[] args){
		
		String test = "Peter Piper picked a peck of pickled peppers";
		char[] charArray = test.toCharArray(); 
		for(int i=0; i<charArray.length; i++){
			System.out.println(charArray[i]);
		}
	}

}
