package arrays;

import java.util.Scanner;

//TC- O(n^2) & AS- O(1)
public class NaiveTrappingRainWaterSolution {
    static int rainWaterGot(int[] arr) {
        int n = arr.length;
        int res = 0;

        for(int i = 1; i < n-1; i++) {

            int lmax = arr[i];
            for(int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }

            int rmax = arr[i];
            for(int j = i+1; j < n; j++) {
                rmax = Math.max(rmax, arr[j]);
            }

            res = res + (Math.min(lmax,rmax)-arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = rainWaterGot(arr);
        System.out.println(res);
    }
}
