/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TH_MaTran {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int hang = sc.nextInt(), cot = sc.nextInt(), k = sc.nextInt();
            k--;
            int[][] a = new int[hang][cot];
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < hang; i++) {
                for (int j = i; j < hang; j++) {
                    if (a[i][k] > a[j][k]) {
                        int tmp = a[i][k];
                        a[i][k] = a[j][k];
                        a[j][k] = tmp;
                    }
                }
            }
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
