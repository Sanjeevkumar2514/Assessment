package StringExamples;

public class RemoveSpaces {
	public static void main(String[] args) {
	    java.util.Scanner s1=new java.util.Scanner(System.in);
		String str=s1.nextLine();
		 str = str.replaceAll("\\s","");
		 System.out.print(str);
		
		
	}
}
