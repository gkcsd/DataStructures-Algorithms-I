package string;

import java.util.Scanner;


//output1:
//        ganesh kale ganesh
//        esh
//        Hint:h 88
//        Hint:p 52
//        Hint:t 70
//        3 15

//output2:
//        ganesh kale ganesh
//        nesh
//        Hint:h 5
//        Hint:p 97
//        Hint:t 43
//        2 14


public class RabinKarpAlgorithm {
    static final int d = 256;
    static final int q = 101;
    static void RKSearch(String pat, String txt, int M, int N) {
        //Calculate (d^(M-1))%q
        int h = 1;
        for(int i = 1; i <= M-1; i++) {
            h = (h*d)%q;
        }
        System.out.println("Hint:h " + h);

        //Calculate p and to
        int p = 0, t = 0;
        for(int i = 0; i < M; i++) {
            p = (p*d + pat.charAt(i))%q;
            t = (t*d + txt.charAt(i))%q;
        }
        System.out.println("Hint:p " + p);
        System.out.println("Hint:t " + t);

        for(int i = 0; i <= (N-M); i++) {
            //Check for Spurious hits
            if(p == t) {
                boolean flag = true;
                for(int j = 0; j < M; j++) {
                    if(txt.charAt(i+j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    System.out.print(i + " ");
                }
            }

            //Calculate ti+1 using ti
            if(i < N-M) {
                t = ((d*(t-txt.charAt(i)*h)) + txt.charAt(i+M))%q;
            }
            if(t < 0) {
                t = t+q;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String pat = sc.next();

        int M = pat.length();
        int N = txt.length();
        RKSearch(pat, txt, M, N);
    }
}
