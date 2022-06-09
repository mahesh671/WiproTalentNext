package classobject;
class Calculator
{
	static int powerInt(int num1,int num2)
	{
		int ans=1;
		for(;num2>0;num2--)
			ans*=num1;
		return ans;
		
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}
}

public class Calciobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Calculator.powerInt(5,3));
		System.out.println(Calculator.powerDouble(2.5, 1.8));
	}

}
