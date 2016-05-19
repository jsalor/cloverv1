import java.util.ArrayList;


public class UnionArrays {
	public int [] merge (int[] a,int[] b)
	{
		int i=0;
		int j=0;
		int k=0;
		int c[]=new int[a.length+b.length];
		while (i<a.length && j<b.length)
		{
			if (a[i]<b[j]){
				c[k]=a[i];
				k++;
				i++;
			}
			else
			{
				c[k]=a[j];
				k++;
				j++;
			}
		}
		for (int iter=i;iter<a.length;iter++)
		{
			c[k]=a[iter];
			k++;
		}
		for (int iter=j;iter<b.length;iter++)
		{
			c[k]=b[iter];
			k++;
		}
		return c;
	}
}
