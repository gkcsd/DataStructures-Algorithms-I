package practiceproblems;
//AUTHOR- GKCSD [Ganesh Kale]
//ALL RIGHTS RESERVED

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class ApplicationId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char res =  funSolution(n);
        System.out.println(res);
    }
    public static char funSolution(int n) {
        int sum = 0;
        char res = ' ';
        int temp = n;
        while (temp != 0) {
            int val = temp % 10;
            sum += val;

            temp /= 10;
        }

        if (sum >= 1 && sum <= 26) {
            res = (char)(sum+64);
        } else {
            int sum2 = 0;
            while(sum != 0) {
                int val = sum%10;
                sum2+=val;

                sum/=10;
            }

            if(sum2 >= 1 && sum2 <= 26) {
                res = (char)(sum2+64);
            }
        }
        return res;
    }
}
