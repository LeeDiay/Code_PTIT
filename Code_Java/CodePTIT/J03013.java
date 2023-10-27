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
public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            if(a.length() == 0) a = "0";
            if(b.length() == 0) b = "0";
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            BigInteger z = x.subtract(y);
            z = z.abs();
            String c = z.toString();
            int max = Math.max(a.length(), b.length());
            while(c.length() < max) {
                c = "0" + c;
            }
            System.out.println(c);
        }
    }
}
