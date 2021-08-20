package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedMaximumConsecutive1sSolution {
    static int maxConsecutive(int[] arr) {
        int n = arr.length;
        int res = 0, count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                count = 0;
            }else{
                count++;
                res = Math.max(count, res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = maxConsecutive(arr);
        System.out.println(res);
    }
}
