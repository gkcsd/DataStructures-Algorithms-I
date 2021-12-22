package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class WindowSlidingUnsortedNonNegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = sc.nextInt();

        boolean res = getResult(arr, sum);

        if(res) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static boolean getResult(int[] arr, int sum) {
        int currSum = arr[0], s = 0;
        int n = arr.length;

        for(int e = 1; e < n; e++) {
            while(currSum > sum && s < e-1) {
                currSum -= arr[s];
                s++;
            }
            if(currSum == sum) {
                return true;
            }
            if(e < n) {
                currSum += arr[e];
            }
        }

        return (currSum == sum);
    }
}
