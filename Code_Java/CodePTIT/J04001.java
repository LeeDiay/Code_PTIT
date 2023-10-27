/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point b) {
        return Math.sqrt((this.x - b.x) * (this.x - b.x) + (this.y - b.y) * (this.y - b.y));
    }

    public double distance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

}

public class J04001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point a = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point(x, y);
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
