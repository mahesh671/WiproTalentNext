package flowcontrol;

import java.util.Scanner;

public class ColorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//red,blue,green,orange,yellow,White
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter char of colour in caps");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'R':
			
			System.out.println("Red");
			break;
			
		case 'B':
			System.out.println("Blue");
			break;
			
		case 'G':
			System.out.println("Green");
			break;
			
		case 'O':
			System.out.println("Orange");
			break;
		
		case 'Y':
			System.out.println("Yellow");
			break;
		
		case 'W':
			System.out.println("White");
			break;
			
		default:
			System.out.println("Invalid Code");
			
			
		
		}
	}

}
