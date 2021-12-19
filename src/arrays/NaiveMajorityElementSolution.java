package arrays;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class NaiveMajorityElementSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = majorityElem(arr);
        System.out.println(res);
    }
    static int majorityElem(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int count = 1;
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > n/2) {
                return i;
            }
        }

        return -1;
    }
}
