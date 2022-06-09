package stringprog;

import java.util.Scanner;

public class BeforAfter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuffer s =new StringBuffer(sc.next());
		int i=s.indexOf("*");
		s.delete(i-1, i+2);
		System.out.println(s);

	}

}
