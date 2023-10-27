/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010;

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
        ArrayList<MatHang> mh = new ArrayList<>();
        int stt = 1;
        for (int i = 0; i < t; i++) {
             sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double giamu = sc.nextDouble();
            double giaba = sc.nextDouble();
            mh.add(new MatHang(stt, ten, nhom, giamu, giaba));
            stt++;
        }
        Collections.sort(mh);
        for (MatHang x : mh) {
            System.out.println(x);
        }
    }
}
