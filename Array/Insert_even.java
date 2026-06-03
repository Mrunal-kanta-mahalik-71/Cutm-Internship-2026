package Array;
import java.util.Scanner;
public class Insert_even 
{
    public static void main(String [] arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int [] arr=new int[size];
    System.out.println("Enter the element to the array");
    int count=0;
    for(int i=0;i<size;i++)
    {
        int temp=sc.nextInt();
        if(temp%2==0)
        {
            arr[count]=temp;
            count++;
        }
    }
    for(int i=0;i<count;i++)
    {
        System.out.print(arr[i]+" ");
    }
    sc.close();
    }
}
