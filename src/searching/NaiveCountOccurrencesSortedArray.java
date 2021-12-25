package searching;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class NaiveCountOccurrencesSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = getCountOccur(arr, x);
        System.out.println(res);
    }
    static int getCountOccur(int[] arr, int x) {
        int count = 0;
        for (int j : arr) {
            if (j == x) {
                count++;
            }
        }
        return count;
    }
}
