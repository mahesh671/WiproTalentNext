package flowcontrol;

import java.util.Scanner;

public class Digitsum {

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
			s+=r;
			n/=10;
		}
		System.out.println("The sum of digits in "+o+" is "+s);
	}

}
