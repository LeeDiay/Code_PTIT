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
public class J01024 {

    public static boolean check(long n) {
        long a;
        while (n != 0) {
            a = n % 10;
            if (a != 0 && a != 1 && a != 2) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (check(n) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
