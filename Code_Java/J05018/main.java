/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int stt = 1;
        ArrayList<BangDiem> bd = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double toan = sc.nextDouble();
            double van = sc.nextDouble();
            double ta = sc.nextDouble();
            double li = sc.nextDouble();
            double hoa = sc.nextDouble();
            double sinh = sc.nextDouble();
            double su = sc.nextDouble();
            double dia = sc.nextDouble();
            double gdcd = sc.nextDouble();
            double congnghe = sc.nextDouble();
            bd.add(new BangDiem(stt, ten, toan, van, ta, li, hoa, sinh, su, dia, gdcd, congnghe));
            stt++;
        }
        Collections.sort(bd, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                return Double.compare(o2.getDiem(), o1.getDiem());
            }
            
        });
        for (BangDiem x : bd) {
            System.out.println(x);
        }
    }
}
