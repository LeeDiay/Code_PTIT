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
public class J03006 {
    public static boolean check(String s) {
        int l = s.length();
        for (int i = 0; i <= l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1) || (s.charAt(i) - '0') % 2 == 1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            if (check(str) == true)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
