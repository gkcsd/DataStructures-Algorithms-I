package arrays;

import java.util.Scanner;

public class PrefixSumSolutionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefSum = getResult(arr);

        int l = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(getSolution(prefSum, l, r));
    }
    static int getSolution(int[] prefSum, int l, int r) {
        if(l != 0) {
            return prefSum[r] - prefSum[l-1];
        }else{
            return prefSum[r];
        }
    }

    static int[] getResult(int[] arr) {
        int n = arr.length;
        int[] prefSum = new int[n];

        prefSum[0] = arr[0];

        for(int i = 1; i < n; i++)
        {
            prefSum[i] = prefSum[i - 1] + arr[i];
        }

        return prefSum;
    }
}
