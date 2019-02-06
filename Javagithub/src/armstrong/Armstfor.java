package armstrong;

import java.util.Scanner;

public class Armstfor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		int r,sum=0,temp,i=0;
		temp=n;
		for(;temp!=0;temp/=10,++i);
			temp=n;
		for(;temp!=0;temp/=10) {
			r=temp%10;
			sum+=Math.pow(r, i);
		}
		System.out.println("Iteration Result: "+i);
		System.out.println("Sum Result: "+sum);
		if(n==sum)
			System.out.println(n+" is a Armstrong Number");
		else
			System.out.println("The Enter Integer is Not a Armstrong Number");
		s.close();
	}
}
