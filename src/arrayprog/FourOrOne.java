package arrayprog;

import java.util.Scanner;

public class FourOrOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of elements :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		boolean in=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=4 && a[i]!=1)
			{
				in=false;
				break;
			}
		}
		System.out.println(in);
	}

}
