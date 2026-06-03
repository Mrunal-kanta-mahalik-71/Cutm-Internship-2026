package Array;
import java.util.*;
public class vowel 
{
 public static void main(String [] arg)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    char [] arr=new char[size];
    System.out.println("Enter character to the array");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.next().charAt(0);
    }
    System.out.println("Vowel elements are :");
    for(int i=0;i<size;i++)
    {
        if(arr[i]=='A'|| arr[i]=='E'|| arr[i]=='I'|| arr[i]=='O'|| arr[i]=='U'|| arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u')
        {
            System.out.print(arr[i]+" ");
        }
    }
    sc.close();
}   
}