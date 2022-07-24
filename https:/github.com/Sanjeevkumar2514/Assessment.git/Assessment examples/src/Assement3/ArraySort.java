package Assement3;

import java.util.Arrays;

public class ArraySort {
	 static int a[] = { -1, -2, -3, 1, 2, 4 };
	  static int temp;
	  public static void main (String[]args)
	  {
	    // TODO Auto-generated method stub
	    for (int i = 0; i < a.length-1; i++)
	      {
		    if (a[i] > a[i+1])
		      {
	        		temp = a[i];
	        		a[i] = a[i+1];
	        		a[i+1] = temp;
	        		i=-1;
		      }
	      }
		    System.out.println (Arrays.toString(a));

	  }
}
