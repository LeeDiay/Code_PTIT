/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

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
        
        int stt = 1;
        ArrayList<ThiSinh> ts = new ArrayList<>();
        
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String birth = sc.nextLine();
            double m1 = sc.nextDouble();
            sc.nextLine();
            double m2 = sc.nextDouble();
            sc.nextLine();
            double m3 = sc.nextDouble();
            ts.add(new ThiSinh(stt, name, birth, m1, m2, m3));
            stt++;
        }
        Collections.sort(ts);
        double max = ts.get(0).getSum();
        for (ThiSinh x : ts) {
            if (x.getSum() == max) {
                System.out.println(x);
            }
        }
    }
}
