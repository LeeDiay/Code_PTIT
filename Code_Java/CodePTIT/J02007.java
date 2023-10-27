/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author DELL
 */
public class J02007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] dd = new int[10000];
            for (int i = 0; i < n; i++) {
                dd[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                dd[a[i]]++;
            }
            System.out.printf("Test %d:\n", j);
            for (int i = 0; i < n; i++) {
                if (dd[a[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], dd[a[i]]);
                }
                dd[a[i]] = 0;
            }
        }
    }
}
