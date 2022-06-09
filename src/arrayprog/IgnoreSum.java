
package arrayprog;

import java.util.Scanner;

public class IgnoreSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int i=0,j=0,s=0;
		boolean t=false;
		while(i<a.length)
		{
			if(a[i]==6)
			{
				j=i;
				while(a[j]!=7 && j<a.length-1 )
					j++;
				
				i=j+1;
				//System.out.println(j);
			}
			if(i>=a.length)
			{ 
				t=true;
				break;
			}
			
			s+=a[i];
			i++;
		}
		if (t)
		{
			s+=6;
		}
		System.out.println("Sum = "+s);
	}

}
