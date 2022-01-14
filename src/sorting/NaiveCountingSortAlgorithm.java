package sorting;

import java.util.Scanner;

//TC- O(n+k) & AS- O(n)
public class NaiveCountingSortAlgorithm {
    static void countSort(int[] arr, int k) {
        int n = arr.length;
        int[] count = new int[k];

        for(int i = 0; i < k; i++) {
            count[i] = 0;
        }
        for(int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < count[i]; j++) {
                arr[index] = i;
                index++;
            }
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
