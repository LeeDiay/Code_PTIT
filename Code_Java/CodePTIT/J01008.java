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
public class J01008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int N = sc.nextInt();
            int n = N;
            System.out.printf("Test %d: ", j);
            for (int i = 2; i < Math.sqrt(n); i++) {
                int dem = 0;
                while (n % i == 0) {
                    dem++;
                    n /= i;
                }
                if (dem != 0) {
                    System.out.printf("%d(%d) ", i, dem);
                }
            }
            if (n != 1) {
                System.out.printf("%d(%d) ", n, 1);
            }
            System.out.println();
        }
    }
}
