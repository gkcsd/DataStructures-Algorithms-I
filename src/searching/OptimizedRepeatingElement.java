package searching;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedRepeatingElement {
    static int getRepeatingElem(int[] arr) {
        int n = arr.length;
        int slow = arr[0]+1, fast = arr[0]+1;

        do {
            slow = arr[slow] +1;
            fast = arr[arr[fast]+1] + 1;
        } while(slow != fast);

        slow = arr[0] + 1;
        while(slow != fast) {
            fast = arr[fast] + 1;
            slow = arr[slow] + 1;
        }

        return slow-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = getRepeatingElem(arr);
        System.out.println(res);
    }
}
