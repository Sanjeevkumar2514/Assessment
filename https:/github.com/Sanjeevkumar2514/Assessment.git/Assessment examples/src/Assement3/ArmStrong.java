package Assement3;

public class ArmStrong {
	public static void main(String[] args) 
	{
	    java.util.Scanner s1=new java.util.Scanner(System.in);
	    System.out.println("Enter a number to find armstrong number:");
		int n=s1.nextInt(),c=0,sum=0;
		int temp=n;
        while(n>0)
        {
           n=n/10; 
           c++;
        }
        n=temp;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            sum=sum+(int)(Math.pow(r,c));
        }
		if(temp==sum)
		{
		    System.out.println(temp+" is a armstrong number");
		}
		else{
		    System.out.println(temp+" is not a armstrong number");
		}
	}

}
