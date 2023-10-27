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
public class J02013 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            if (isSorted) {
                return;
            }
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
