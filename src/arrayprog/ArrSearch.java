package arrayprog;

import java.util.Scanner;

public class ArrSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[8];
		System.out.println("Enter the 8 values of arr");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter search element");
		int s=sc.nextInt();
		int ind=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(s==arr[i])
			{
				ind=i;
			}
		}
		if(ind!=-1)
		{
		System.out.println(ind);
		}
		else
		{
			System.out.println(ind);
		}
		
			

	}

}
