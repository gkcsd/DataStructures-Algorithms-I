package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Map;

//TC- Θ(n) & AS- Θ(n)
public class OptimizedLargestCommonSpanWithSameSumInBinaryArrays {
    static int getResult(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i]-arr2[i];
        }

        Map<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        int prefSum = 0;
        for(int i = 0; i < temp.length; i++) {
            prefSum += temp[i];

            if(prefSum == 0) {
                res = i+1;
            }

            if(hm.containsKey(prefSum)) {
                res = Math.max(res, i-hm.get(prefSum));
            }

            hm.put(prefSum, i);
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
