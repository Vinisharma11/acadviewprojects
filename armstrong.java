import java.util.*;
class Armstrong{  
  public static void main(String[] args)
  {  
    int b=0,a,temp; 
    System.out.println("Enter a number"); 
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    temp=n;  
    while(n>0)  
     {  
        a=n%10;  
        n=n/10;  
        b=b+(a*a*a);  
     }  
    if(temp==b)  
        System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  