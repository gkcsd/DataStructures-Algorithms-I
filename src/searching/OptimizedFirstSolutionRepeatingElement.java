package searching;

import java.util.Scanner;

//TC- O(n) & AS- O(n)
public class OptimizedFirstSolutionRepeatingElement {
    static int getRepeatingElem(int[] arr) {
        int n = arr.length;

        boolean[] visited = new boolean[n-1];

        for(int i = 0; i < n; i++) {
            if(visited[arr[i]]) {
                return arr[i];
            }

            visited[arr[i]] = true;
        }
        return -1;
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
