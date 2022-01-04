package sorting;

import java.util.Scanner;

//TC- Θ(m+n) & AS- Θ(1)
public class OptimizedSolutionIntersectionOfTwoSortedArrays {
    static void getResult(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        while(i < m && j < n) {
            if(i > 0 && arr1[i] == arr1[i-1]) {
                i++;
                continue;
            }

            if(arr1[i] < arr2[j]) {
                i++;
            }else if(arr1[i] > arr2[j]) {
                j++;
            }else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 =sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i <n2; i++) {
            arr2[i] = sc.nextInt();
        }

        getResult(arr1, arr2);
    }
}
