package Array;
import java.util.Scanner;
public class Sum
{
      public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr= new int [size];
        System.out.println("Enter the element to the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of array elements are :"+sum);
        sc.close();
    }
}
