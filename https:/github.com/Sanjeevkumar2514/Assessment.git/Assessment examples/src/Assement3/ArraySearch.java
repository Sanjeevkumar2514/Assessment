package Assement3;

public class ArraySearch {
	public static void main(String[] args) 
	{
	    java.util.Scanner s1=new java.util.Scanner(System.in);
		int a[]={2,3,5,25,43,57};
		System.out.print("enter the key value:");
		int key=s1.nextInt();
		int i;
		for(i=0;i<a.length-1;i++)
		{
		    if(a[i]==key)
		    {
		        System.out.print("found");
		        break;
		    }
		}
		if(a[i]!=key)
		{
		    System.out.print("Notfound");
		}
		
	}

}
