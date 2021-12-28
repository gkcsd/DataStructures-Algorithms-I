package searching;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(n(log(n))) & AS- O(1)
public class NaiveSolutionRepeatingElement {
    static int getRepeatingElem(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                return arr[i];
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
        int res = getRepeatingElem(arr);
        System.out.println(res);
    }
}
