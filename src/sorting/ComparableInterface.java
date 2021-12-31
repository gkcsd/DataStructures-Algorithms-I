package sorting;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Point implements Comparable<Point> {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        return this.x - p.x;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        Point arr1[] = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
        Arrays.sort(arr1);
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i].x + " " + arr1[i].y);
        }
    }
}
