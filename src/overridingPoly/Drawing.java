package overridingPoly;
class Shape
{
	void draw()
	{
		System.out.println("Drawing Shape");
	}
	void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}



public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a =new Circle();
		Shape b=new Triangle();
		Shape c=new Square();
		a.draw();
		a.erase();
		b.draw();
		b.erase();
		c.draw();
		c.erase();
		

	}

}
