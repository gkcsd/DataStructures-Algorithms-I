package sorting;

import java.util.Scanner;

//TC- O(n) & AS- O(n)
public class NaiveSolutionSortAnArrayWithTwoTypesOfElement {
    static void getResult(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int i = 0;

        for(int j = 0; j < n; j++) {
            if(arr[j] < 0) {
                temp[i] = arr[j];
                i++;
            }
        }

        for(int j = 0; j < n; j++) {
            if(arr[j] > 0) {
                temp[i] = arr[j];
                i++;
            }
        }

        for(int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        getResult(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
