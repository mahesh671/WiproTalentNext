package overridingPoly;
class Fruit
{
	String name,taste;
	int size;
	void eat()
	{
		System.out.println("BASE class Fruit Name:"+name+taste+size);
	}
}
class Orange extends Fruit
{
	Orange()
	{
	this.name="Orange";
	this.taste="Sweet";
	this.size=20;
	}
	void eat()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Taste: "+this.taste);
		System.out.println("Size: "+this.size);
	}
	
}
class Apple extends Fruit
{
	Apple()
	{
	this.name="Apple";
	this.taste="Crispy sweet";
	this.size=25;
	}
	void eat()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Taste: "+this.taste);
		System.out.println("Size: "+this.size);
	}
	
}

public class AppleOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ob1=new Apple();
		Orange ob2=new Orange();
		ob1.eat();
		ob2.eat();

	}

}
