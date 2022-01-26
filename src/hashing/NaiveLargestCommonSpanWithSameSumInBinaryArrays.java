package hashing;

import java.util.Scanner;

//TC- Θ(n*n) & AS- O(1)
public class NaiveLargestCommonSpanWithSameSumInBinaryArrays {
    static int getResult(int[] arr1, int[] arr2) {
        int res = 0;
        for(int i = 0; i < arr1.length; i++) {
            int sum1 = 0, sum2 = 0;
            for(int j = i; j < arr1.length; j++) {
                sum1 += arr1[j];
                sum2 += arr2[j];

                if(sum1 == sum2) {
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int res = getResult(arr1, arr2);
        System.out.println(res);
    }
}
