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
public class J03032 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for (int i = 0; i < a.length; i++) {
                StringBuilder sb = new StringBuilder(a[i]);
                System.out.print(sb.reverse() + " ");
            }
            System.out.println();
        }
    }
   
}
