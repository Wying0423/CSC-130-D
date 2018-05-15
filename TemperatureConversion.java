//Wying Feb 8th 2018

import java.util.Scanner;
public class TemperatureConversion {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
		

		int temp;
		
		temp = scnr.nextInt();
			
	System.out.print(temp + " C" + " is ");
	System.out.print(temp*9/5+32);
	System.out.println(" F");
	
		System.out.println(temp + " F" + " is " + (temp-32)*5/9 + " C");
		// TODO Auto-generated method stub
scnr.close();
	}

}
