import java.util.*;
  class leapyear
  {
	  public static void main(String[] vi)
	  {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter year");
	    int year=sc.nextInt();
        algebra al=new algebra();
        al.check(year);
    }
  }

class algebra{
void check(int y)
{
  if(y%4==0 && y%100!=0 || y%400==0)
  	System.out.println("leap year");
  else
  	System.out.println("not a leap year");
}
}


