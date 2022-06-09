package flowcontrol;

import java.util.Scanner;

public class ReverseNo {

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
		System.out.println("The reverse of digits in "+o+" is "+s);


	}

}
