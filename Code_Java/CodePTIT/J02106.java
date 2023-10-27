/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J02106 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (dem == 0) {
                dem = 3;
            }
            int ko = 0, mot = 0;
            while (dem != 0) {
                int x = sc.nextInt();
                if (x == 1) {
                    mot++;
                }
                if (x == 0) {
                    ko++;
                }
                dem--;
            }
            if (mot > ko) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
