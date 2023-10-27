/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class K_XAU_NHI_PHAN_DOI_XUNG_DO_DAI_CHAN {

    static int n, ok;
    static int[] a = new int[1000];

    public static void init() {
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
    }

    public static void sinhNP() {
        int i = n - 1;
        while (i >= 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if (i == -1) {
            ok = 0;
        } else {
            a[i] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n1 = sc.nextInt();
            int n2 = 2;
            while (n2 <= n1) {
                n = n2 / 2;
                init();
                ok = 1;
                while (ok == 1) {
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i]);
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[n - i - 1]);
                    }
                    System.out.print(" ");
                    sinhNP();
                }
                n2 += 2;
            }
            System.out.println();
        }
    }
}
