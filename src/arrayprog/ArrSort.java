package arrayprog;

public class ArrSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,4,8,19,48,98};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");

	}

}
