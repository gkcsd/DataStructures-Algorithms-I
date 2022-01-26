package hashing;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(n(log(n))) & AS- O(1)
public class NaiveMoreThanNByKOccurrences {
    static void getNByKOccurrences(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 1, count = 1, n = arr.length;
        while (i < n) {
            while (i < n && arr[i] == arr[i-1]) {
                count++;
                i++;
            }

            if(count > i/k) {
                System.out.print(arr[i-1] + " ");
            }

            count = 1;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        getNByKOccurrences(arr, k);
    }
}
