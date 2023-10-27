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
public class TH_TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1000];
        int[] b = new int[1000];
        int[] dd1 = new int[1000];
        int[] dd2 = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dd1[a[i]]++;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            dd2[b[i]]++;
        }
        for (int i = 0; i < n + m; i++) {
            if (dd1[i] != 0 && dd2[i] != 0)
                System.out.printf("%d ", i);
        }
        System.out.println("");
        for (int i = 0; i < n + m; i++) {
            if (dd1[i] != 0 && dd2[i] == 0)
                System.out.printf("%d ", i);
        }
        System.out.println("");
        for (int i = 0; i < n + m; i++) {
            if (dd1[i] == 0 && dd2[i] != 0)
                System.out.printf("%d ", i);
        }
        System.out.println("");
    }
}
