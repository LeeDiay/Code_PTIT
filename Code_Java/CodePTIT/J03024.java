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
public class J03024 {

    public static boolean checkxau(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean check(String s) {
        int chan = 0, le = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                chan++;
            }
            else le++;
        }
        if ((s.length() % 2 == 0)&& chan > le)
            return true;
        if ((s.length() % 2 == 1)&& le > chan)
            return true;
        if (chan == le)
            return false;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (checkxau(s) == false) {
                System.out.println("INVALID");
            } else {
                if (check(s) == true)
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
