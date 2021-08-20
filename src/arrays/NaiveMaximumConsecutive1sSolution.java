package arrays;

import java.util.Scanner;

public class NaiveMaximumConsecutive1sSolution {
    static int getMax(int[] arr) {
        int n = arr.length;
        int res = 0;

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = i; j < n; j++) {
                if(arr[j] == 1) {
                    count++;
                }else{
                    break;
                }
            }
            res = Math.max(count,res);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int res = getMax(arr);
        System.out.println(res);
    }
}
