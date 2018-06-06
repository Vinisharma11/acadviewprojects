import java.util.*;
class Numb{
   public static void main(String [] vini)
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter a number");
      int a= sc.nextInt();
      if(a%3==0)
        { 
        	if(a%5==0)
        	System.out.println("AcadView Learning");
        	else
        	System.out.println("AcadView");
        }	
      else if(a%5==0)
         System.out.println("Learning"); 
      else
      	System.out.println("not divisible");
    }
}