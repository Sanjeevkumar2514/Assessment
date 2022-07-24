package Assement3;
public class Vowelcount
{
		public static void main(String[] args) 
		{
			java.util.Scanner s1=new java.util.Scanner(System.in);
			System.out.println("please enter the string to calculate vowels and consonants:");
			String name=s1.nextLine();
			int c=0,count=0;
			name=name.toLowerCase();
			for(int i=0;i<name.length();i++)
			{
			    if((name.charAt(i)=='a')||(name.charAt(i)=='e')||(name.charAt(i)=='i')||(name.charAt(i)=='o')||(name.charAt(i)=='u'))
			    {
			        count++;
			    }
			    else{
			        c++;
			    }
			}
			System.out.println("This are the vowels in the String "+count);
			System.out.print("This are the consonants in the String "+c);
		}
}
