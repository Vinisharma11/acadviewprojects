import java.util.Scanner;
class Array
{
    public static void main(String[] args) 
    {
          int i,j,t;
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter no. of elements you want in array:");
          int n = sc.nextInt();
          int a[] = new int[n];
          System.out.println("Enter all the elements:");
          for (i = 0; i < n; i++) 
          {
            a[i] = sc.nextInt();
          }
          for ( i = 0; i < n; i++) 
          {
            for (j = i + 1;j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
          }
        System.out.println("Ascending Order:");
        for (i = 0; i < n - 1; i++) 
        {
            System.out.println(a[i]);
        }
        System.out.print(a[n - 1]);
    }
}