package Assement3;

public class NearestPrime {
	public static boolean isprime(int number)
	  {
	    for (int i = 2; i < (number / 2); i++)
	      {
		if (number % i == 0)
		  {
		    return false;
		  }
	      }
	    return true;
	  }
	  public static void main (String[]args)
	  {
	    java.util.Scanner s1 = new java.util.Scanner (System.in);
	    System.out.println ("Please Enter the Number:");
	    int input = s1.nextInt ();
	    for (int i = 1; i <= input; i++)
	    {
		    int n= input+i;
		    if(isprime(n))
		    {
		        System.out.println ("The nearest prime number is:" + n);
		        break;
		    }
		    n= input-i;
		    if(isprime(n))
		    {
		        System.out.println ("The nearest prime number is:" +n);
		        break;
	        }
	    }
	  }
}
