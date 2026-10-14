package com.itp.coreclasses;

public class Point2D {

    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "Point (" + x + ", " + y + ")";
    }

    public boolean isEquals(Point2D p3) {
        return this.x == p3.x && this.y == p3.y;
    }

    public Point2D createNewPoint(int xOffset, int yOffset) {
        return new Point2D(this.x + xOffset, this.y + yOffset);
    }
    
    public double calculateDistance(Point2D p3) {
        return Math.sqrt( Math.pow(p3.x - this.x, 2)+ Math.pow(p3.y - this.y, 2));
    }
}