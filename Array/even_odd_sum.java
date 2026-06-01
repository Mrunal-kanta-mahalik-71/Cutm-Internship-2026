package Array;
import java.util.Scanner;
public class even_odd_sum
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
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                evensum=evensum+arr[i];
            }
            else
            {
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println("Sum of even index elements are :"+evensum);
        System.out.println("Sum of odd index elements are :"+oddsum);
        sc.close();
    }
}
