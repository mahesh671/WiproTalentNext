package arrayprog;

import java.util.Scanner;

public class RemoveTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements");
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
		int[] a=new int[n];
		int[] b=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int i=0,j=0;
		for(;i<a.length;i++)
		{
			if(a[i]==10)
				continue;
			b[j]=a[i];
			j++;
		}
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
			
		}

	}

}
