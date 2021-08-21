package arrays;

import java.util.Scanner;

//Tc- O(n^2) & AS- O(1)
public class NaiveSolutionLongestEvenOddSubArraySolution {
    static int getMaxEvenOddSubArray(int[] arr) {
        int n = arr.length;
        int res = 1;

        for(int i = 0; i < n; i++) {
            int curr = 1;
            for(int j = i+1; j < n; j++) {
                if((arr[j]%2 == 0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 && arr[j-1]%2 == 0))
                    curr++;
                else
                    break;
            }
            res = Math.max(curr,res);
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
        int res = getMaxEvenOddSubArray(arr);
        System.out.println(res);
    }
}
