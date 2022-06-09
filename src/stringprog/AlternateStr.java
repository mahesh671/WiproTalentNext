package stringprog;

import java.util.Scanner;

public class AlternateStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two strings with coma separation ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String [] sl=s.split(",");
		int l1=sl[0].length();
		int l2=sl[1].length();
		int i=0,j=0;
		StringBuffer ans=new StringBuffer();
		while(i+j<l1+l2)
		{
			if(i<sl[0].length())
			{
				ans.append(sl[0].charAt(i));
				i++;
			}
			if(j<sl[1].length())
			{
				ans.append(sl[1].charAt(j));
				j++;
			}
		}
		System.out.println(ans);
		
		

	}

}
