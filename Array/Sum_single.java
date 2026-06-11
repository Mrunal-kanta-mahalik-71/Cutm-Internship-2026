package Array;
import java.util.*;
public class Sum_single {

    public static int[] singleDigitSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int num = arr[i];

            while (num >= 10) {
                int sum = 0;

                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }

                num = sum;
            }

            arr[i] = num;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleDigitSum()));
    }
}
