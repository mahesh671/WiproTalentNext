package arrayprog;

public class TwoDnine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=9)
		{
			System.out.println("Please enter 9 integer numbers ");
			
		}
		else
		{
			int a[][] = new int[3][3];
			int big=Integer.MIN_VALUE;
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The given array is :");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					System.out.print(a[i][j]+" ");
					if(big<a[i][j])
						big=a[i][j];
				}
				System.out.println();
			}
			System.out.println("The biggest value in array is : "+big);
			
		}

	}

}
