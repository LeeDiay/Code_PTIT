/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05006;

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
        sc.nextLine();
        int stt = 1;
        ArrayList<NhanVien> nv = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String diachi = sc.nextLine();
            String masothue = sc.nextLine();
            String ngayki = sc.nextLine();
            nv.add(new NhanVien(stt, ten, gt, ns, diachi, masothue, ngayki));
            stt++;
        }
        for (NhanVien x : nv) {
            System.out.println(x);
        }
            
    }
}
