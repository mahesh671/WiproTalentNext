package stringprog;

import java.util.Scanner;

public class XflX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		StringBuffer s=new StringBuffer(sc.next());
		if(s.charAt(0)=='x')
		{
			s.deleteCharAt(0);
		}
		if(s.charAt(s.length()-1)=='x')
		{
			s.deleteCharAt(s.length()-1);
		}
		System.out.println("Ans= "+s);
		
	}

}
