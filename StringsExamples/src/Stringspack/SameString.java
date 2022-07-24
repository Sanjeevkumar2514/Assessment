package Stringspack;

import java.util.Arrays;
import java.util.Scanner;

public class SameString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.next();
		    String s1=sc.next();
		    char ch[]=s.toCharArray();
		    char ch1[]=s1.toCharArray();
		    Arrays.sort(ch);
		    Arrays.sort(ch1);
		    String s2=new String(ch); 
		      String s3=new String(ch1); 
		      if(s2.equalsIgnoreCase(s3))
		      {
		          System.out.println("true");
		      }
		      else{
		          System.out.println("false");
		      }
		}
	}

}
