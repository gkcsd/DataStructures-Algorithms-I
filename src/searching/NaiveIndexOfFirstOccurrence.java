package searching;

import java.util.Scanner;

//TC- O(n) & As- O(1)
public class NaiveIndexOfFirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int res = getFirstOccur(arr, x);
        System.out.println(res);
    }
    static int getFirstOccur(int[] arr, int x) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
