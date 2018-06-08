import java.util.*;
  class Sum
  {
	  public static void main(String[] vi)
	  {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter 1st number");
	    int numb1=sc.nextInt();
	    System.out.println("enter 2nd number");
	    int numb2=sc.nextInt();
        algebra al=new algebra();
	    al.add(numb1,numb2);
	    
    }
  }

class algebra{
void add(int a,int b)
{
  int sum=a+b;
  System.out.println("sum="+sum);
}
}


