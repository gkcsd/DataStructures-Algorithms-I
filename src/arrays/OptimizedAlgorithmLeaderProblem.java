package arrays;

import java.util.Scanner;

//TC- O(n) & As- O(1)
public class OptimizedAlgorithmLeaderProblem {
    static void leaderFun(int[] arr) {
        int n = arr.length;
        int currentLeader = arr[n-1];
        System.out.print(currentLeader + " ");

        for(int i = n-2; i >= 0; i--) {
            if(currentLeader < arr[i]) {
                currentLeader = arr[i];
                System.out.print(currentLeader + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leaderFun(arr);
    }
}
