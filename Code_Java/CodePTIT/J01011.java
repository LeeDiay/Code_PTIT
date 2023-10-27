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
public class J01011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = a, m = b;
            long r;
            while (m != 0) {
                r = n % m;
                n = m;
                m = r;
            }
            System.out.printf("%d %d", a * b / n, n);
            System.out.println();
        }

    }
}
