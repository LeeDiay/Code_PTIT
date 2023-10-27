/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05023;

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
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", res);
            res = res.substring(2);
            for (SinhVien x : sv) {
                if (x.getClas().substring(1, 3).equals(res)) {
                    System.out.println(x);
                }
            }
        }
    }
}
