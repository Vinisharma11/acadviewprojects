import java.util.*;
class search
{  

 public static void Searchelement(int []arr, int beg,int end, int number)
 {  
   int mid = (beg + end)/2;  
   while( beg <= end )
   {  
      if ( arr[mid] < number )
      {  
        beg = mid + 1;     
      }
      else if ( arr[mid] == number )
      {  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }
      else
      {  
         end = mid - 1;  
      }  
      mid = (beg + end)/2;  
   }  
      if ( beg > end )
      {  
         System.out.println("Element is not found!");  
      }  
 }  
 public static void main(String[] args){ 
       Scanner sc= new Scanner(System.in); 
        System.out.println("Enter no. of elements you want in array:");
          int n = sc.nextInt();
          int arr[] = new int[n];
          System.out.println("Enter all the elements:");
          for ( int i = 0; i < n; i++) 
          {
            arr[i] = sc.nextInt();
          }
          System.out.println("Enter no.to be searched");
          int number=sc.nextInt();
       
        int end= arr.length-1;  
        Searchelement(arr,0,end, number);     
 }  
}  