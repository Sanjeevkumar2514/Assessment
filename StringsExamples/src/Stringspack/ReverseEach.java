package Stringspack;

class ReverseEach {

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
  			  System.out.print (s1[j]);
  		  }
  		  System.out.print (" ");
  	  }
    }
}
