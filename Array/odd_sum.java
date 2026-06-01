package Array;
import java.util.Scanner;
public class odd_sum 
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
        int oddsum=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2!=0)
            {
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println("Sum of odd array elements are :"+oddsum);
        sc.close();
    }
}
