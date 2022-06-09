package abstractpro;

import java.util.Random;

abstract class Compartment
{
	public abstract String Notice();
}
class FirstClass extends Compartment
{
	@Override
	public String Notice() {
		// TODO Auto-generated method stub
		return "First Class";
	}
}
class Ladies extends Compartment
{
	@Override
	public String Notice() {
		// TODO Auto-generated method stub
		return "Ladies";
	}
}
class General extends Compartment
{
	@Override
	public String Notice() {
		// TODO Auto-generated method stub
		return "General";
	}
}
class Luggage extends Compartment
{
	@Override
	public String Notice() {
		// TODO Auto-generated method stub
		return "Luggage";
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment c[]=new Compartment[10];
		Random r=new Random();
		for(int i=0;i<c.length;i++)
		{
			int ch=r.nextInt(4);
			switch(ch)
			{
			case 0:
				c[i]=new FirstClass();
				break;
			case 1:
				c[i]=new Ladies();
				break;
			case 2:
				c[i]=new General();
				break;
			case 3:
				c[i]=new Luggage();
			}
		}
		for(int i=0;i<c.length;i++)
			System.out.println(c[i].Notice());
		
		
	}

}
