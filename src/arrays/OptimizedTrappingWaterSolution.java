package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(n)
public class OptimizedTrappingWaterSolution {
    static int getWater(int[] arr) {
        int n = arr.length;
        int res = 0;

        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = arr[0];
        for(int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }

        rMax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i+1]);
        }

        for(int i = 1; i <n-1; i++) {
            res = res + (Math.min(lMax[i],rMax[i]) - arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = getWater(arr);
        System.out.println(res);
    }
}
