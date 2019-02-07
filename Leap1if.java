package leapyear;

import java.util.Scanner;

public class Leap1if {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any YEAR: ");
		int year=sc.nextInt();
		
		if(year%400==0 ||((year%4==0)&& (year%100!=0))) 
			System.out.println("Year "+year+" is a Leap Year");
		else
			System.out.println("Year "+year+" is Not a Leap Year");
		sc.close();
		
		System.out.println("mnbvcxzz");
	}

}
