package flowcontrol;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		int r,o, s=0;
		o=n;
		while (n!=0)
		{
			r=n%10;
			s=s*10+r;
			n/=10;
		}
		if (o==s)
		{
			System.out.println(o+" is a palindrome");
		}
		else
		{
			System.out.println(o+" is not a palindrome");
		}

	}

}
