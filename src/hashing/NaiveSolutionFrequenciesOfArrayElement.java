package hashing;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class NaiveSolutionFrequenciesOfArrayElement {
    static void getResult(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean flag = false;
            //Check array element is repeating or not
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            //If seen repeating ignore arr[i]
            if(flag) {
                continue;
            }

            //Count the frequencies
            int count = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        getResult(arr);
    }
}
