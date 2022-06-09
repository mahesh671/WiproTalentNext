package arrayprog;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" Element");
			a[i]=sc.nextInt();
		}
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s+=a[i];
		}
		System.out.println("Sum = "+s);
		System.out.println("Average = "+s/a.length);

	}

}
