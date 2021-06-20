package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//TC- 0(logn) & AS- 0(logn)
public class OptimizedComputingPowerSolutionOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int res = powerCount(x,n);
        System.out.println(res);
    }
    static int powerCount(int x, int n) {
        if(n == 0)
            return 1;

        int temp = (int)Math.pow(x, n/2);
        temp = temp*temp;

        if(n%2 == 0) {
            return temp;
        }else{
            return temp*x;
        }
    }
}
