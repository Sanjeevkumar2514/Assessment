package Assement3;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,45,84,74,84,85};
		int f=arr[0],s=arr[0],t=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>f)
			{
				t=s;
				s=f;
				f=arr[i];
			}
			else if(arr[i]>s)
			{
				t=s;
				s=arr[i];
			}
		}
		if(f==s)
		{	
			System.out.print(t);
		}
		else
		{
			System.out.print(s);
		}
	
	}
}
