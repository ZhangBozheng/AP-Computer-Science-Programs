import java.util.*;
public class SpaceNoodle
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int size= console.nextInt();
		needle(size);
		base(size);
		bottom(size);
		needle(size);
		mid(size);
		base(size);
	}
	public static void needle(int size)
	{
		for(int i=1; i<=size; i++)
		{
			for(int u=1; u<=3*size; u++)
			{
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	public static void base(int size)
	{
		for(int j=1; j<=size; j++)
		{
			for(int s=1; s<=3*(size-j); s++)
			{
				System.out.print(" ");
			}
			System.out.print("__/");
			for(int k=1; k<=3*(j-1); k++)
			{
				System.out.print(":");
			}
			System.out.print("||");
			for(int l=1; l<=3*(j-1); l++)
			{
				System.out.print(":");
			}
			System.out.println("\\__");
		}
		System.out.print("|");
		for(int m=1; m<=6*size; m++)
		{
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void bottom(int size)
	{
		for(int n=1; n<=size; n++)
		{
			for(int t=1; t<=2*(n-1); t++)
			{
				System.out.print(" ");
			}
			System.out.print("\\_");
			for(int o=1; o<=((3*size-1)-2*(n-1)); o++)
			{
				System.out.print("/\\");
			}
			System.out.println("_/");
		}
	}
	public static void mid(int size)
	{
		for(int p=1; p<=size*size; p++)
		{
			for(int v=1; v<=4+5*(0.5*size-1); v++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			for(int q=1; q<=size/2; q++)
			{
				System.out.print("%");
			}
			System.out.print("||");
			for(int r=1; r<=size/2; r++)
			{
				System.out.print("%");
			}
			System.out.println("|");
		}
	}
}