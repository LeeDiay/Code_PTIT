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
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = new BigInteger("11");
            BigInteger c = new BigInteger("0");
            if (a.mod(b).equals(c))
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
