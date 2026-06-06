package Number_Programs;
    import java.util.*;
public class even_or_odd{
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd");
        int x=sc.nextInt();
        if(x%2==0)
        {
            System.out.println(x+" is an even number");
        }
        else
        {
            System.out.println(x+" is a odd number");
        }
        sc.close();
    }
}

