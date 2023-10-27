/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> sv = new ArrayList<>();
        sc.nextLine();
        while (t-- > 0) {
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        t = sc.nextInt();
        sc.nextLine();
        String res;
        while (t-- > 0) {
            res = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", res.toUpperCase());
            for (SinhVien x : sv) {
                if (x.getMsv().equals(res)) {
                    System.out.println(x);
                }
            }
        }
    }
}
