package Array;
import java.util.*;
public class No_of_zero 
{
   public static void main(String [] arg)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int [] arr=new int[size];
    System.out.println("Enter the element to the array");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<size;i++)
    {
        if(arr[i]==0)
        {
            count++;
        }
    }
    System.out.println("Number of zero in the array :"+count);
    sc.close();
   } 
}
