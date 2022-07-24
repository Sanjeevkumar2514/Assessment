package oopsconcept;

import java.util.Scanner;

public class EncapsulationDemo1 {//gmail.com
	//private data members  
		private String username="ksanjeev72@gmail.com";
		private String password="sanjeevkumar";
		void setusername(String username)
		{
			this.username=username;
		}
		String getusername()
		{
			return username;
		}
		void setpassword(String password)
		{
			this.password=password;
		}
		String getpassword()
		{
			return password;
		}
		public static void main(String[]args)
		{
			EncapsulationDemo1 reset=new EncapsulationDemo1();
			System.out.print(reset.getpassword());
			try (Scanner scanner = new Scanner(System.in)) {
				String password=scanner.next();
				reset.setpassword(password);
			}
			System.out.print(reset.getpassword());
		}
}
