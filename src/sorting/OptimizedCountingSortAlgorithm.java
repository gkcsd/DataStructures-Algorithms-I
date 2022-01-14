package sorting;

import java.util.Scanner;

//TC- O(n+k) & AS- O(n+k)
public class OptimizedCountingSortAlgorithm {
    static void countSort(int[] arr, int k) {
        int n = arr.length;
        int[] count = new int[k];
        for(int i = 0; i < k; i++) {
            count[i] = 0;
        }
        for(int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for(int i = 1; i < k; i++) {
            count[i] = count[i-1] + count[i];
        }

        int[] output = new int[n];
        for(int i = n-1; i >= 0; i--) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        for(int i = 0; i < n; i++) {
            arr[i] = output[i];
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

        countSort(arr, k);

        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
