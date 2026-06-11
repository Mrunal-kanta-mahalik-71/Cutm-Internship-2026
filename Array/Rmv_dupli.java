package Array;
import java.util.Scanner;
public class Rmv_dupli 
 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < size; i++) {

            boolean duplicate = false;

            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
