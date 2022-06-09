package stringprog;

import java.util.Scanner;

public class LastSubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String and integer with separation of ','");
		String s=sc.next();
		String[] sl=s.split(",");
		int n=Integer.parseInt(sl[1]);
		s=sl[0].substring(n-1);
		StringBuffer ans =new StringBuffer();
		for(int i=0;i<n;i++)
			ans.append(s);
		System.out.println(ans);
	}
	

}
