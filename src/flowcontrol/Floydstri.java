package flowcontrol;

import java.util.Scanner;

public class Floydstri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		if(args.length>0)
		{
			n=Integer.parseInt(args[0]);
			
		}
		else
		{
			System.out.println("Please Enter a Integer");
			Scanner sc =new Scanner(System.in);
			n=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
