package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedMajorityElementSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = findMajorityElem(arr);
        System.out.println(res);
    }
    static int findMajorityElem(int[] arr) {
        int n = arr.length;
        int res = 0;
        int count = 1;

        for(int i = 1; i < n; i++) {
            if(arr[res] == arr[i]) {
                count++;
            }else {
                count--;
            }

            if(res == 0) {
                res = i;
                count = 1;
            }
        }

        count = 0;
        for (int j : arr) {
            if (arr[res] == j) {
                count++;
            }
        }
        if(count <= n/2) {
            return -1;
        }

        return res;
    }
}
