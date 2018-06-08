import java.util.*;
class number
{
   public static void main(String [] ary)
   {
      System.out.println("enter 3 no.s");
      Scanner j=new Scanner(System.in);
      int first= j.nextInt();
      int second= j.nextInt();
      int third= j.nextInt();
      check1 ch= new check1();
      ch.greater(first,second,third);
    }
}
class check1
{
  void greater(int a,int b,int c)
  {
    if(a>b)
    {
      if(a>c)
        System.out.println("greatest is"+a);
      else
        System.out.println("greatest is"+c);
    }
    else if(b>c)
      System.out.println("greatest is"+b);
  }
}
