package flowcontrol;

import java.util.Scanner;

public class LowtoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a character");
		char a=sc.next().charAt(0);
		if (a>='a' && a<='z')
		{
			int b=(int)a -(int)'a';
			b=(int)'A'+b;
			char c= (char)b;
			System.out.println(a+"-->"+c);
		}
		else if(a>='A' && a<='Z')
		{
			int b=(int)a -(int)'A';
			b=(int)'a'+b;
			char c= (char)b;
			System.out.println(a+"-->"+c);
		}
	}

}
