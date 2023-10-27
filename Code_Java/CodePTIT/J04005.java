/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

class ThiSinh {
    private final String birth;
    private final String name;
    private final double mon1;
    private final double mon2;
    private final double mon3;
    private double sum;

    public ThiSinh(String name, String birth, double mon1, double mon2, double mon3) {
        this.birth = birth;
        this.name = name;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;

    }
    
    public void hienthi() {
        this.sum = this.mon1 + this.mon2 + this.mon3;
        System.out.printf("%s %s %.1f", this.name, this.birth, this.sum);
        System.out.println("");
    }
    
}
/**
 *
 * @author DELL
 */
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        ts.hienthi();
    }
}
