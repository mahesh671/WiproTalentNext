package flowcontrol;

public class Cmdcoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		if (args.length==0)
		{
			System.out.println("No Value");
		}
		else
		{
			for(i=0;i<args.length-1;i++)
			{
				System.out.print(args[i]+",");
			}
			System.out.print(args[i]);
		}

	}

}
