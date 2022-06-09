package stringprog;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String [] s_l=s.split(",");
		StringBuffer ans= new StringBuffer();
		if (s_l[0].charAt(s_l[0].length()-1)==s_l[1].charAt(0))
		{
			ans.append(s_l[0].toLowerCase());
			String t="";
			for(int i=1;i<s_l[1].length();i++)
			{
				t+=s_l[1].charAt(i);
			}
			ans.append(t.toLowerCase());
		}
		else
		{
			ans.append(s_l[0].toLowerCase());
			ans.append(s_l[1].toLowerCase());
		}
		System.out.println("Ans: "+ans);

	}

}
