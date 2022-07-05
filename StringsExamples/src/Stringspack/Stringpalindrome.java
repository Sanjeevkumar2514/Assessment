package Stringspack;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner s1=new java.util.Scanner(System.in);
		 String str= s1.next(), nstr="";
	        char ch;
	       
	      System.out.println("Original word: "+str);
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+nstr);
	      if(str.equals(nstr))
	      {
	    	  System.out.print("The string is palindrome");
	      }
	      else
	      {
	    	  System.out.print("The string is not a palindrome");
	      }
	}

}
