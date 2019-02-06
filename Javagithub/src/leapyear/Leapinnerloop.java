package leapyear;

import java.util.Scanner;

public class Leapinnerloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Year: ");
		int Year=sc.nextInt();
		boolean inloop=false;
		
		if(Year%4==0) {
			if(Year%100==0) {
				if(Year%400==0) 
					inloop=true;
				else
					inloop=false;
				
			}
			else 
				inloop=true;
		}
		else
			inloop=false;
		
		if(inloop)
			System.out.println("Year "+Year+" is a Leap Year ");
		else
			System.out.println("Year "+Year+" is not a Leap Year ");
		sc.close();
	} 

}
