package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TC- O(n) & AS- O(1)
public class NaiveComputingPower  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int res = countPower(x,n);
        System.out.println(res);
    }
    static int countPower(int x, int n) {
        int val = 1;
        for(int i = 1; i<=n; i++) {
            val=val*x;
        }
        return val;
    }
}
