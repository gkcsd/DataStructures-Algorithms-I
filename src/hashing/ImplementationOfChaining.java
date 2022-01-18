package hashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.*;

class MyHash {
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b) {
        BUCKET = b;

        table = new ArrayList<LinkedList<Integer>>();

        for(int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(Integer key) {
        int i = key%BUCKET;
        table.get(i).add(key);
    }

    void remove(Integer key) {
        int i = key%BUCKET;
        table.get(i).remove(key);
    }

    boolean search(Integer key) {
        int i = key%BUCKET;
        return table.get(i).contains(key);
    }
}

public class ImplementationOfChaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MyHash mh = new MyHash(n);

        mh.insert(70);
        mh.insert(71);
        mh.insert(9);
        mh.insert(56);
        mh.insert(72);

        mh.search(56);

        mh.remove(71);
        System.out.println(mh.table);
    }
}
