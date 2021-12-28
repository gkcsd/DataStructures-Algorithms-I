package searching;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class SuperNaiveSolutionRepeatingElement {
    static int getRepeatingElem(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
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
