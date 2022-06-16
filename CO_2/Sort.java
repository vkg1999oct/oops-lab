import java.util.*;
class Sort
{
	public static void main(String args[])
	{
		int n;
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: of strings you enter  :");
		n=sc.nextInt();
		String name[]=new String[n];
		System.out.println("Enter all NAME");

		for(int i=0;i<n;i++)
		{
			name[i]=sc.next();
		}

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;

				}
			}
		}

		System.out.println("SORTED NAMES");
		for(int i=0;i<n;i++)
		{
			System.out.println(name[i]);
		}
}}