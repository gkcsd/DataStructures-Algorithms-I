package string;

import java.util.Scanner;

public class ReverseWordsInString {
    static void getReverseString(char[] str) {
        int start = 0;
        for(int end = 0; end < str.length; end++) {
            if(str[end] == ' ') {
                reverseString(str, start, end-1);
                start = end+1;
            }
        }

        reverseString(str, start, str.length-1);
        reverseString(str, 0, str.length-1);

    }

    static void reverseString(char[] str, int low, int high) {
        while(low <= high) {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] str = st.toCharArray();

        getReverseString(str);

        String string = new String(str);

        System.out.println(string);
    }
}
