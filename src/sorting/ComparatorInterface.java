package sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyCmp implements Comparator<PointOne> {
    public int compare(PointOne p1, PointOne p2) {
        return p1.x - p2.x;
    }
}

class PointOne {
    int x, y;
    PointOne(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        PointOne arr[] = {new PointOne(10, 20), new PointOne(3, 12), new PointOne(5, 7)};

        Arrays.sort(arr, new MyCmp());
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
