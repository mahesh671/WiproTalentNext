package classobject;

import java.util.Scanner;

class Box
{
	int height,width,depth;
	Box(int width,int height,int depth )
	{
		
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	int volume()
	{
		int v= this.depth*this.height*this.width;
		return v;
		
	}
}

public class ClasssObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter  width height depth");
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int h=sc.nextInt();
		int d=sc.nextInt();
		Box obj=new Box(w,h,d);
		System.out.println("volume = "+obj.volume());
		

	}

}
