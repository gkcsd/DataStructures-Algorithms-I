package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TC- O(logn) & AS- O(1)
public class OptimizedIterativePowerSolutionTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int res = iterativePower(x,n);
        System.out.println(res);
    }
    static int iterativePower(int x, int n) {
        int res = 1;
        while(n>0) {
            if(n%2 != 0) {
                res = res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
}
