package hashing;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class NaivePairWithGivenSumInUnsortedArray {
    static boolean getResult(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(sum == arr[i]+arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 13;
        boolean res = getResult(arr, sum);
        System.out.println(res);
    }
}
