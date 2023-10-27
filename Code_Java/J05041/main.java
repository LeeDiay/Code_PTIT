/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05041;

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
        ArrayList<BangLuong> bl = new ArrayList<>();
        while (t-- > 0) {
            bl.add(new BangLuong(stt, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
            stt++;
        }
        Collections.sort(bl);
        for (BangLuong x : bl) {
            System.out.println(x);
        }
    }
}
