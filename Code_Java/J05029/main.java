/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ThucTap> tt = new ArrayList<>();
        while (t-- > 0) {
            tt.add(new ThucTap(sc.nextLine(), sc.nextLine(), sc.nextInt()));
            sc.nextLine();
        }
        Collections.sort(tt);
        t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a, b);
            for (ThucTap x : tt) {
                if (x.getCnt() >= a && x.getCnt() <= b)
                    System.out.println(x);
            }
        }
       
        
    }
}
