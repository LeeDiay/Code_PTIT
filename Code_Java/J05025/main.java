/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05025;

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
        int stt = 1;
        ArrayList<GiangVien> gv = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            gv.add(new GiangVien(stt, sc.nextLine(), sc.nextLine()));
            stt++;
        }
        Collections.sort(gv);
        for (GiangVien x : gv) {
            System.out.println(x);
        }
    }
}
