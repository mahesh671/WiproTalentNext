package flowcontrol;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g=args[0];
		int age=Integer.parseInt(args[1]);
		System.out.println(args[0]);
//		g="Male";
//		age=90;
		if(g.equals("Female"))
		{ 
			//System.out.println("Entered");
			if (age>=1&&age<=58)
			{
				System.out.println("The percentage of intrest is 8.2%");
			}
			else if(age>=59 && age<=100)
			{
				System.out.println("The percentage of intrest is 9.2%");
			}
		}
		else if (g.equals("Male"))
		{
			if (age>=1&&age<=58)
			{
				System.out.println("The percentage of intrest is 8.4%");
			}
			else if(age>=59 && age<=100)
			{
				System.out.println("The percentage of intrest is 10.5%");
			}
		}
		else
		{
			System.out.println("Else");
		}

	}

}
