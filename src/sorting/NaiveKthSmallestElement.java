package sorting;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(n(log(n))) & AS- O(1)
public class NaiveKthSmallestElement {
    static int getResult(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int res = getResult(arr, k);
        System.out.println(res);
    }
}
