package Array;
import java.util.Scanner;
public class odd_elements 
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
        System.out.println("Retrive odd elements are :");
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]+" ");
            }
        }
        sc.close();
    }
}
