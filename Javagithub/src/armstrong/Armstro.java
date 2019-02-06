package armstrong;

import java.util.Scanner;

public class Armstro {
	public static void main(String[] args) {
		int r,sum=0,temp;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is a Armstrong Number");
		else
			System.out.println("The Enter Integer is Not a Armstrong Number");
		s.close();
	}
}
