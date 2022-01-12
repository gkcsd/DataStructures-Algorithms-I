package sorting;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(n(log(n))) & AS- O(1)
public class MeetingTheMaximumGuests {
    static int getResult(int[] arrival, int[] departure) {
        int n = arrival.length;

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int res = 1, curr = 1, i = 1, j = 0;

        while(i < n && j < n) {
            if(arrival[i] <= departure[j]) {
                curr++;
                i++;
            }else {
                curr--;
                j++;
            }

            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arrival = new int[n1];
        for(int i = 0; i < n1; i++) {
            arrival[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] departure = new int[n2];
        for(int i = 0; i < n2; i++) {
            departure[i] = sc.nextInt();
        }

        int res = getResult(arrival, departure);
        System.out.println(res);
    }
}
