package string;

import java.util.Scanner;

//TC- O(n^2)
public class NaiveLeftMostRepeatingCharacter {
    static int getMaxLeftChar(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int res = getMaxLeftChar(str);
        System.out.println(res);
    }
}
