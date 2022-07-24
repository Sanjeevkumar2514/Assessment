package StringExamples;

public class StringReverse {
	public static void main(String[] args) {
	    java.util.Scanner s1=new java.util.Scanner(System.in);
		StringBuffer sb=new StringBuffer(s1.nextLine());  
		sb.reverse();
		System.out.println(sb);
	}
}
