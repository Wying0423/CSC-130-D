/* Wying Feb 27 2018 */

// in-class activity Day 07, how many days have you been alived.


import java.util.Scanner;

public class ObjectDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userYear;
		int userMonth;
		int userDay;
		
		// For Year
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Year");
		userYear = input.nextInt();
		
		//For Month
		System.out.println("Enter a Month");
		userMonth = input.nextInt();
		
		//For Day
		System.out.println("Enter a Day");
		userDay = input.nextInt();
		
		Day bDay = new Day(userYear, userMonth, userDay);
		Day today = new Day();
		
		System.out.print("You have been alive for " + today.daysFrom(bDay) + " Day!");
	}

}
