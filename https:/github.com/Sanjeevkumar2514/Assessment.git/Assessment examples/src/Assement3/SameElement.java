package Assement3;

import java.util.Arrays;

public class SameElement {
	public static void main(String[] args) 
	{
    		java.util.Scanner s1=new java.util.Scanner(System.in);
		int a[]={2,3,5,25,43,57};
		int b[]={2,3,5,25,43,57};
    		Arrays.sort(a);
    			Arrays.sort(b);
		boolean returnVal1 = Arrays.equals(a,b);
    			System.out.println(returnVal1);
	
	}

}
