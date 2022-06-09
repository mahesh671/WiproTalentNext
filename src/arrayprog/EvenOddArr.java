package arrayprog;

import java.util.Scanner;

public class EvenOddArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of elements in array");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter elements of array");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int l=0;
		int r=a.length-1;
		while (l<r)
		{
			while(a[l]%2==0 && l<r)
				l++;
			while(a[r]%2==1 && l<r)
				r--;
			if(l<r)
			{
				int t=a[l];
				a[l]=a[r];
				a[r]=t;
				l++;
				r--;
			}
			
		}
		System.out.println("Array is:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}

}
