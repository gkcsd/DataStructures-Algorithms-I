package hashing;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class NaiveCountDistinctElement {
    static int getResult(int[] arr) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                res++;
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
