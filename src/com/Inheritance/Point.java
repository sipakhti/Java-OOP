package com.Inheritance;

import java.util.Objects;

public class Point {
    private int x , y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//
//        if (!(obj instanceof Point))
//            return false;
//
//        var other = (Point) obj;
//        return other.x == x && other.y == y;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }

    @Override
    public boolean equals(Object o) {
        // Comparing memory location to see if the object is the same instance
        if (this == o) return true;
        //  below statement is similar to this statement >>>>  if !(o instanceof Point)
        if (o == null || getClass() != o.getClass()) return false;
        // downcasting
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
