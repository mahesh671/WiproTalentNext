package flowcontrol;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int c=0;
		for (int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				
			{
				c++;
			}
		}
		if (c!=0)
		{
			System.out.println(n+" is not Prime");
		}
		else
		{
			System.out.println(n+" is prime");
		}
		

	}

}
