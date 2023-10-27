/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05050;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int stt = 1;
        ArrayList<TienDien> td = new ArrayList<>();
        while (t-- > 0) {
            td.add(new TienDien(stt, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
            stt++;
        }
        for (TienDien x : td) {
            System.out.println(x);
        }
    }
}
