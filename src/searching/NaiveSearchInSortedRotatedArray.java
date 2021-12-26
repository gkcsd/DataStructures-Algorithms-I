package searching;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class NaiveSearchInSortedRotatedArray {
    static int getSearch(int[] arr, int x) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int res = getSearch(arr, x);
        System.out.println(res);
    }
}
