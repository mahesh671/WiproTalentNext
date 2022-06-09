package flowcontrol;

public class PrimeBetw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=10;j<100;j++)
		{
			int c=0;
			for (int i=2;i<=j/2;i++)
			{
				if(j%i==0)
					
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(j);
			}
		}
	}

}
