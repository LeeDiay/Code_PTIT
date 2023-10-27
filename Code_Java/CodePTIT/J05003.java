/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {

    private final String id;
    private final String name;
    private final String clas;
    private final String birth;
    private final double gpa;

    public SinhVien(int stt, String name, String clas, String birth, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", stt);
        this.name = name;
        this.clas = clas;
        this.gpa = gpa;
        if (birth.charAt(1) == '/')
            birth = "0" + birth;
        if (birth.charAt(4) == '/')
            birth = birth.substring(0, 3) + "0" + birth.substring(3);
        this.birth = birth;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.clas + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }
      
}


/**
 *
 * @author DELL
 */
public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int stt = 1;
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double gp = Double.parseDouble(sc.nextLine());
            sv.add(new SinhVien(stt, ten, lop, ns, gp));
            stt++;
        }
        for (SinhVien x : sv) {
            System.out.println(x);
        }
    }
}
