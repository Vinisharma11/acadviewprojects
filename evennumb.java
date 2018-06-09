import java.util.*;

class Even{

	public static void main(String []args)
    {
		int n=0,i=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter range ");
		n = sc.nextInt();
		
		for(i=1; i<n; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}	
		
	}
}
