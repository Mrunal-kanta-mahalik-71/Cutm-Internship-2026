package Array;
import java.util.Scanner;
public class Second_Last 
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
        int i=0;
        for(;i<size-2;i++)
        {

        }
        System.out.println("Second Last element :"+arr[i]);
        sc.close();
    }
}
