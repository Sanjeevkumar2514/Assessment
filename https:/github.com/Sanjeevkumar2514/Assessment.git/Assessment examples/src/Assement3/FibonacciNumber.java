package Assement3;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciNumber {
	public static void main (String[]args)
		{
			ArrayList al=new ArrayList();
			Scanner stringswap = new Scanner (System.in);
			int a=0,b=1;
			System.out.print("How many fibonacci numbers do you want:");
			int n=stringswap.nextInt();
			ArrayList AL=new ArrayList();
			for(int i=1;i<=n;i++)
			{
    				int c=a+b;
    				al.add(a);
    				a=b;
    				b=c;
			}
			System.out.print("The first "+n+" fibonacci numbers are:"+al);
		}

}
