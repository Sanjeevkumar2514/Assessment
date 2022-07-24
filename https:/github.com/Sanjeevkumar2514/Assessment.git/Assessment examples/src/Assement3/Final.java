package Assement3;

public class Final {
	 final int age = 18;//declaring final variable
	    void display() {  
	    age = 55; // reassigning value to age variable gives compile time error  
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Final obj = new Final();  
		    obj.display();  

	}

}
