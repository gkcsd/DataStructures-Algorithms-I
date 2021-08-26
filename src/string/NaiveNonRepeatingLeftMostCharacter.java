package string;

import java.util.Scanner;

//TC- O(n^2) & As- O(1)
public class NaiveNonRepeatingLeftMostCharacter {
    static int getNonRepeatingLeftMostChar(String str) {
        for(int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for(int j = 0; j < str.length(); j++) {
                if(i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int res = getNonRepeatingLeftMostChar(str);
        System.out.println(res);
    }
}
