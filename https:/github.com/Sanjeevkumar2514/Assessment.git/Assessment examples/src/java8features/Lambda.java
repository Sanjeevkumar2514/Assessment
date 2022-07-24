package java8features;

public class Lambda {
	  public String say();  
	}  
	public class LambdaExpression{  
	public static void main(String[] args) {  
	    Lambda s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}  
}
		