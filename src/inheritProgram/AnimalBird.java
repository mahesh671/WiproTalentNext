package inheritProgram;
class Animal
{
	void eat()
	{
		System.out.println("Animal eats");
	}
	void sleep()
	{
		System.out.println("Animal sleep");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Bird eats");
		
	}
	void sleep()
	{
		System.out.println("Bird sleep");
	}
	void fly()
	{
		System.out.println("Bird fly");
	}
}

public class AnimalBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion=new Animal();
		Bird sparrow =new Bird();
		lion.eat();
		lion.sleep();
		sparrow.eat();
		sparrow.sleep();
		sparrow.fly();
				
	}

}
