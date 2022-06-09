package arrayprog;

import java.util.Arrays;
import java.util.Scanner;

public class LargeSmallTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements");
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
		int[] a=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int max,max2,min,min2;
		Arrays.sort(a);
		max=a[a.length-1];
		max2=a[a.length-2];
		min=a[0];
		min2=a[1];
		System.out.println("MAX="+max+"\n2nd Max"+max2+"\nMin"+min+"\n2ndMin"+min2);

	}

}
