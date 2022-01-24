package hashing;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class NaiveSumArrayWithGivenSum {
    static boolean getResult(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for(int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if(currSum == sum)
                    return true;
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

        int sum = 22;
        boolean res = getResult(arr, sum);
        System.out.println(res);
    }
}
