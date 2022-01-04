package sorting;

import java.util.Scanner;

//TC- O(m*n) & AS- Θ(1)
public class NaiveSolutionIntersectionOfTwoSortedArrays {
    static void getResult(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        for(int i = 0; i < m; i++) {

            if(i > 0 && arr1[i] == arr1[i-1])
                continue;

            for(int j = 0; j < n; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        getResult(arr1, arr2);

    }
}
