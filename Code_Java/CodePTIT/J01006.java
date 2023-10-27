/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.*;

/**
 *
 * @author DELL
 */
public class J01006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[100];
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= 98; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            System.out.println(a[n]);
        }
    }
}
