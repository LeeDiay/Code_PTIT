/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05034;

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
        ArrayList<ThucTap> tt = new ArrayList<>();
        while (t-- > 0) {
            tt.add(new ThucTap(stt, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine() ));
            stt++;
        }
        Collections.sort(tt);
        t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String res = sc.nextLine();
            for (ThucTap x : tt) {
                if (x.getDoanhNghiep().equals(res)) {
                    System.out.println(x);
                }
            }
        }
    }
}
