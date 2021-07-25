package practiceproblems;
//Author- GKCSD

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Lapindromes {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while (T-- > 0) {
          String name = fs.next();
          String s1, s2;

          int n = name.length();

          if(n%2 == 0) {
              s1 = name.substring(0, (n/2));
              s2 = name.substring((n/2), n);
          }else {
              s1 = name.substring(0,(n/2));
              s2 = name.substring((n/2)+1,n);
          }


          char c1[] = s1.toCharArray();
          char c2[] = s2.toCharArray();

          Arrays.sort(c1);
          Arrays.sort(c2);

          if(Arrays.equals(c1,c2)) {
              System.out.println("YES");
          }else{
              System.out.println("NO");
          }
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreElements())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
