import java.util.Scanner;
public class AuthoringAssistant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// part 1.
		
Scanner scnr = new Scanner(System.in);
String userString = scnr.nextLine();

System.out.println("Enter a sample text: ");
System.out.println(userString);
System.out.println("");

System.out.println("You entered: "+userString);
System.out.println("");

	}
	
	// part 2.
	
public static char printMenu(Scanner scnr) {
	char menuOption;
	
	System.out.println("MENU");
	System.out.println("c - Number of non-whitespace characters");
	System.out.println("w - Number of words");
	System.out.println("f - Find text");
	System.out.println("r - Replace all !'s");
	System.out.println("s - Shorten spaces");
	System.out.println("q - Quit");
	menuOption = ' ';
	System.out.println("");
	
	System.out.println();
	
	while (menuOption != 'c' && menuOption != 'w' && menuOption != 'f' && menuOption != 'r' && menuOption != 's' && menuOption != 'q') {
		System.out.println("Choose an option:");
		menuOption = scnr.nextLine().charAt(0); 
		
	}
	return menuOption;	
}
public static int getNumOfNonWSCharacters(final String userStr) {
	int count;
	int i;
	count =0;
	
	for (i=0;i<userStr.length();++i) {
		if(Character.isWhitespace(userStr.charAt(i))==false) {
			++count;
			
		}
	}
	return count;
}
}

