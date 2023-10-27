/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05011;

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
        ArrayList<TinhGio> tg = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String timein = sc.nextLine();
            String timeout = sc.nextLine();
            tg.add(new TinhGio(ma, ten, timein, timeout));
        }
        Collections.sort(tg);
        for (TinhGio x : tg) {
            System.out.println(x);
        }
    }
}
