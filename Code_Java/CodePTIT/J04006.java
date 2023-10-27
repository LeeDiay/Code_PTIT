/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;


class SinhVien {
    private final String name;
    private final String clas;
    private final String birth;
    private final double gpa;

    public SinhVien(String name, String clas, String birth, double gpa) {
        this.name = name;
        this.clas = clas;
        this.birth = birth;
        this.gpa = gpa;
    }
    
    public void hienthi() {
        String res = "";
        String[] s = this.birth.split("/");
        for (String x : s) {
            if (x.length() == 1) {
                res = res + '0' + x;
            }
            else res = res + x;
            if (x.length() < 3)
                res += '/';
        }
        System.out.printf("B20DCCN001 %s %s %s %.2f", this.name, this.clas, res, this.gpa);
    }
}
/**
 *
 * @author DELL
 */
public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        sv.hienthi();
    }
}
