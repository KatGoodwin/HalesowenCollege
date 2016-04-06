import java.util.Scanner;
public class TestInput {
	
	public static void main (String[] args){
		Scanner scan =  new Scanner(System.in);
		String yourName = "";
		String yourQuest = "";
		String favouriteColour = "";
		System.out.println("Answer these questions with a single word");
		System.out.println("What is your name?");
		//https://www.youtube.com/watch?v=_7iXw9zZrLo
		yourName = scan.next();
		System.out.println("What is your quest?");
		yourQuest = scan.next();
		System.out.println("What is	your favourite colour?");
		favouriteColour = scan.next();
		System.out.println("Name: " + yourName);
		System.out.println("Quest:  " + yourQuest);
		System.out.println("Colour: " + favouriteColour);
		
		total = yourName * yourQuest;
		nameInt = Integer.ParseInt(yourName)
		
	}
}