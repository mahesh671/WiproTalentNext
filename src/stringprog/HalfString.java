package stringprog;

import java.util.Scanner;

public class HalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		if(s.length()%2==0)
		{
			System.out.println(s.substring(0,s.length()/2));
		}
		else
			System.out.println("null");
		

	}

}
