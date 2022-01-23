package hashing;

import java.util.Scanner;

//TC- O(m*(n+m) & AS- O(1)
public class NaiveSolutionIntersectionOfTwoArrays {
    static int intersectionOfTwoArrays(int[] arrOne, int[] arrTwo) {
        int n = arrOne.length, m = arrTwo.length, res = 0;

        for(int i = 0; i < n; i++) {
            boolean flag = false;
            for(int j = 0; j < i; j++) {
                if(arrOne[i] == arrOne[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                continue;
            }

            for(int j = 0; j < m; j++) {
                if(arrOne[i] == arrTwo[j]) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrOne = new int[n];
        for(int i = 0; i < n; i++) {
            arrOne[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arrTwo = new int[m];
        for(int i = 0; i < m; i++) {
            arrTwo[i] = sc.nextInt();
        }

        int res = intersectionOfTwoArrays(arrOne, arrTwo);
        System.out.println(res);
    }
}
