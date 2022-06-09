package stringprog;

import java.util.Scanner;

public class ShortLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter string1:");
		StringBuffer s1=new StringBuffer(sc.next());
		//StringBuffer s1=new StringBuffer();
		System.out.println("Enter string2:");
		StringBuffer s2=new StringBuffer(sc.next());
		
		StringBuffer temp;
		if(s1.length()>s2.length())
		{
			temp=s1;
			s1=s2;
			s2=temp;
			
		}
		StringBuffer ans=new StringBuffer();
		ans.append(s1.toString()+s2.toString()+s1.toString());
		System.out.println(ans);
		
	}

}
