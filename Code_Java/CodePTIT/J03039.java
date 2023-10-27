/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = new BigInteger("0");
            if (a.mod(b).equals(c) || b.mod(a).equals(c))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
