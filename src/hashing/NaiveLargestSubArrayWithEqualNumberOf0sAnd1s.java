package hashing;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class NaiveLargestSubArrayWithEqualNumberOf0sAnd1s {
    static int getResult(int[] arr) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            int countZeros = 0, countOnes = 0;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] == 0) {
                    countZeros++;
                }else {
                    countOnes++;
                }

                if(countOnes == countZeros) {
                    res = Math.max(res, countOnes+countZeros);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = getResult(arr);
        System.out.println(res);
    }
}
