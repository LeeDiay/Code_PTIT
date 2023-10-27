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
public class J03005 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String res = "";
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            for (int i = 1; i < a.length; i++) {
                res += a[i].substring(0, 1).toUpperCase();
                res += a[i].substring(1).toLowerCase();
                res += " ";
            }
            String res2 = a[0].toUpperCase();
            System.out.printf(res.substring(0, res.length() - 1) + ", " + res2 + "\n");
        }
    }
}
