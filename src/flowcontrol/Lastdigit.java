package flowcontrol;

import java.util.Scanner;

public class Lastdigit {
	static boolean lastdigit(int a,int b)
	{
		if (a%10==b%10)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter b number");
		int b= sc.nextInt();
		System.out.println(a+" and "+ b+" have same lastdigit: "+lastdigit(a,b));
		
	}

}
