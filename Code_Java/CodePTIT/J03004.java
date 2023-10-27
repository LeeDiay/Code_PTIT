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
public class J03004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            for (String str : a) {
                String ktd = str.substring(0, 1).toUpperCase();
                String kts = str.substring(1).toLowerCase();
                System.out.print(ktd + kts + " ");
            }
            System.out.println("\n");
        }
    }
}
