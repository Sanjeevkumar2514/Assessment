package Assement3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
public class EvenFromList {
	     static Random rand=new Random();
		public static void main(String[] args)
		{
		    	List<Integer>list= new ArrayList();
				for(int i=0;i<=5;i++)
	    			{
	    			  int ra=rand.nextInt(100)+1;
	    			  list.add(ra);  
	    			}
			Iterator itr= list.iterator();
			while (itr.hasNext())
			{
				int j=(int)itr.next();
				if(j%2==0)
				System.out.println(j);
			}
		}

}
