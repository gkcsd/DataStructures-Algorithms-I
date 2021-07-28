package practiceproblems;

//Author- GKCSD

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ChessFormat {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while (T-- > 0) {
            int a=fs.nextInt();
            int b=fs.nextInt();
            int c=a+b;

            if(c<3) {
                System.out.println(1);
            }else if(c >= 3 && c <=10) {
                System.out.println(2);
            }else if(c >= 11 && c <= 60) {
                System.out.println(3);
            }else if(c > 60) {
                System.out.println(4);
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
