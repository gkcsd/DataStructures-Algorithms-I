package hashing;

import java.util.Scanner;
import java.lang.*;

class MyHashTwo {
    int[] arr;
    int cap, size;

    MyHashTwo(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
        for(int i = 0; i < cap; i++) {
            arr[i] = -1;
        }
    }

    int hash(int key) {
        return key%cap;
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;

        while(arr[i] != -1) {
            if(arr[i] == key) {
                return true;
            }
            i = (i+1)%cap;

            if(i == h) {
                return false;
            }
        }
        return false;
    }

    boolean insert(int key) {
        if(size == cap) {
            return false;
        }

        int i = hash(key);

        while(arr[i] != -1 && arr[i] != -2 && arr[i] != key) {
            i = (i+1)%cap;
        }

        if(arr[i] == key) {
            return false;
        }else {
            arr[i] = key;
            size++;
            return true;
        }
    }

    boolean erase(int key) {
        int h = hash(key);
        int i = h;

        while(arr[i] != -1) {
            if(arr[i] == key) {
                arr[i] = -2;
                return true;
            }

            i = (i+1)%cap;

            if(i == h) {
                return false;
            }
        }
        return false;
    }

}

public class ImplementationOfOpenAddressing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashTwo mh = new MyHashTwo(sc.nextInt());

        mh.insert(49);
        mh.insert(50);
        mh.insert(63);
        mh.insert(64);
        mh.insert(69);
        mh.insert(68);

        for(int x: mh.arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        mh.erase(50);
        mh.erase(63);
        mh.erase(64);

        for(int x: mh.arr) {
            System.out.print(x + " ");
        }

        mh.search(63);
        mh.search(100);
    }
}
