package StringExamples;

public class ReverseEach {
	   static java.util.Scanner sc= new java.util.Scanner(System.in);;

		public static void main (String[]args)
	    {
	  	  String str = "sanjeev kumar is a good boy";
	  	  String[] strArray = str.split (" ");
	  	  for (int i = 0; i <strArray.length; i++)
	  	  {
	  		char[] s1 = strArray[i].toCharArray ();
	  		  for (int j = s1.length - 1; j >= 0; j--)
	  		  {
	  			  if(s1[j]==(s1.length-1))
	  			  System.out.print (s1[j].toUpperCase());
	  		  }
	  		  System.out.print (" ");
	  	  }
	    }

}
