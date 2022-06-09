package stringprog;

import java.util.Scanner;

public class FLstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuffer s=new StringBuffer(sc.next());
		s.deleteCharAt(0);
		s.deleteCharAt(s.length()-1);
		System.out.println(s);
	}

}
