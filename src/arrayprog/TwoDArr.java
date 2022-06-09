package arrayprog;

public class TwoDArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=4)
		{
			System.out.println("Please enter 4 integer numbers ");
			
		}
		else
		{
			int a[][] = new int[2][2];
			int r[][]=new int[2][2];
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					r[i][j]=Integer.parseInt(args[args.length-k-1]);
					k++;
				}
			}
			System.out.println("The given array is :");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The reverse array is ");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					System.out.print(r[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
