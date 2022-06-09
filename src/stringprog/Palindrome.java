package stringprog;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.next();
		int l=0,r=s.length()-1;
		boolean f=true;
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r))
			{
				f=false;
				break;
			}
			l++;
			r--;
				
		}
		if (f)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
