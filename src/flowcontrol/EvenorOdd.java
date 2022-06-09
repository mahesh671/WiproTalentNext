package flowcontrol;
import java.util.*;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a =sc.nextInt();
		if (a%2==0)
		{
			System.out.println(a+" is Even");
			
		}
		else {
			System.out.println(a+" is Odd");
		}

	}

}
