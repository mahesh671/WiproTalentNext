package arrayprog;

import java.util.Scanner;

public class ArrMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[8];
		System.out.println("Enter the 8 values of arr");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Maximum= "+max+" and Minimum= "+min);
		

	}

}
