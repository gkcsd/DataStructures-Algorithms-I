package hashing;

import java.util.Scanner;

//TC- O(arrOne.length*arrTwo.length+(arrTwo*(arrOne+arrTwo)))
public class NaiveUnionOfTwoUnsortedArrays {
    static int unionOfTwoUnsortedArrays(int[] arrOne, int[] arrTwo) {
        int[] dist = new int[arrOne.length+arrTwo.length];
        int count = 0;
        for(int i = 0; i < arrOne.length; i++) {
            boolean flag = true;
            for(int j = 0; j < dist.length; j++) {
                if(arrOne[i] == dist[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                dist[count] = arrOne[i];
                count++;
            }
        }

        for(int i = 0; i < arrTwo.length; i++) {
            boolean flag = true;
            for(int j = 0; j < dist.length; j++) {
                if(arrTwo[i] == dist[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                dist[count] = arrTwo[i];
                count++;
            }
        }
        return count++;
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

        int res = unionOfTwoUnsortedArrays(arrOne, arrTwo);
        System.out.println(res);
    }
}
