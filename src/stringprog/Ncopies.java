package stringprog;

import java.util.Scanner;

public class Ncopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<s.length();i++)
			ans.append(s.substring(0, 2));
		System.out.println(ans);
		

	}

}
