package flowcontrol;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a =sc.nextInt();
		if (a>0)
		{
			System.out.println(a+" is positive");
		}
		else if(a<0)
		{
			System.out.println(a+" is negative");
			
		}
		else
		{
			System.out.println("Given number is zero ");
		}

	}

}
