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
public class J01010 {
    public static Scanner ip = new Scanner(System.in);

    public static long solve(String s) {
        long n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '0':
                case '8':
                case '9':
                    n = n * 10;
                    break;
                case '1':
                    n = n * 10 + 1;
                    break;
                default:
                    return 0;
            }
        }
        return n;
    }

    public static void testCase() {
        String s = ip.next();
        long res = solve(s);
        if (res == 0) {
            System.out.println("INVALID");
        } else {
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        int T = ip.nextInt();
        while (T-- > 0) {
            testCase();
        }
    }
}
