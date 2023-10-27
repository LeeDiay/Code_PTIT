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
public class J01007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[100];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= 95; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int check = 0;
            
            for (int i = 0; i <= 95; i++) {
                if (n == a[i]) {
                    System.out.println("YES");
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("NO");
            }

        }
    }
}
