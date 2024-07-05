
import java.util.*;

public class Find_Two_Missing_Numbers {

    static void findTwoMissingNumbers(int arr[], int n) {
        int XOR = arr[0];
        for (int i = 1; i < n - 2; i++)
            XOR ^= arr[i];
        for (int i = 1; i <= n; i++)
            XOR ^= i;

        int set_bit_no = XOR & ~(XOR - 1);

        int num1 = 0, num2 = 0;
        for (int i = 0; i < n - 2; i++) {
            if ((arr[i] & set_bit_no) > 0)
                num1 = num1 ^ arr[i];
            else
                num2 = num2 ^ arr[i];
        }

        for (int i = 1; i <= n; i++) {
            if ((i & set_bit_no) > 0)

                num1 = num1 ^ i;
            else
                num2 = num2 ^ i;
        }
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };

        int n = 2 + arr.length;

        findTwoMissingNumbers(arr, n);

    }
}