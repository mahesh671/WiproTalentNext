package arrayprog;

import java.util.Scanner;

public class MiddleValues {
	public static int[] Midd(int[] a,int[] b)
	{
		int c[]=new int[2];
		c[0]=a[1];
		c[1]=b[1];
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[3];
		int b[]=new int[3];
		int c[]=new int[2];
		System.out.println("Enter 3 numbers for A array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();

		System.out.println("Enter 3 numbers for B array");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		
		c=Midd(a,b);
		System.out.println("The mid Elements are");
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+",");
		
	}

}
