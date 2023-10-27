/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

class Rectange {

    private double width, height;
    private String color;

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectange() {
        this.height = 1;
        this.width = 1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        String res = this.color.substring(0, 1).toUpperCase() + this.color.substring(1).toLowerCase();
        return res;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        double P = this.height * this.width;
        return P;
    }

    public double findPerimeter() {
        return (this.height + this.width) * 2;
    }
}

/**
 *
 * @author DELL
 */
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        if (cd <= 0 || cr <= 0) {
            System.out.println("INVALID");
            return;
        }
       // sc.nextLine();
        String mau = sc.next();
        Rectange hcn = new Rectange(cd, cr, mau);
        System.out.printf("%.0f %.0f ", hcn.findPerimeter(), hcn.findArea());
        System.out.println(hcn.getColor());
    }
}
