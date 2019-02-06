package armstrong;

import java.util.Scanner;

public class Armjavawhile {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int r,sum=0,temp;
		temp=n;
		while(n!=0) {
			r=n%10;
			sum+=Math.pow(r, 3);
			n/=10;
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println(temp+" is a Armstrong Number");
		else
			System.out.println("The Enter Integer is Not a Armstrong Number");
		s.close();
	}
}
