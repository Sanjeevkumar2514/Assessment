package Assement3;

import java.util.Scanner;

public class FactorialDemo {
	public static void main (String[]args)
	  {
	    Scanner fib= new Scanner (System.in);
	    System.out.print("Enter the number:");
	    int n=fib.nextInt();
	    int fact=1;
	    for(int i=1;i<=n;i++)
	    {
	        fact=fact*i;
	    }
	    System.out.print("The factorial of "+n+" is:"+fact);
	  }

}
