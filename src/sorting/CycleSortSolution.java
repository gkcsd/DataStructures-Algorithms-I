package sorting;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1) //It's in-place and not-stable algorithm ,but useful when less memory writes.
public class CycleSortSolution {
    static void cycleSortDistinct(int[] arr) {
        int n = arr.length;

        for(int cs = 0; cs < n-1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for(int i = cs+1; i < n; i++) {
                if(arr[i] < item) {
                    pos++;
                }
            }

            //Swapping
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while(pos != cs) {
                pos = cs;

                for(int i = cs+1; i < n; i++) {
                    if(arr[i] < item) {
                        pos++;
                    }
                }

                //Swapping
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        cycleSortDistinct(arr);

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
