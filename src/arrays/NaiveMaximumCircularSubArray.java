package arrays;

import java.util.Scanner;

public class NaiveMaximumCircularSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = maxCircularSubArray(arr);

        System.out.println(res);
    }
    static int maxCircularSubArray(int[] arr) {
        int n = arr.length;
        int res = arr[0];

        for(int i = 0; i < n; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];

            for(int j = 1; j < n; j++) {
                int index = (i+j)%n;
                System.out.print(index + " ");
                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }
            res = Math.max(res, curr_max);
        }
        return res;
    }
}
