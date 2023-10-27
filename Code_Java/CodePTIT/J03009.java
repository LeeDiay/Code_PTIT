/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> a = new TreeSet<String>();
        TreeSet<String> b = new TreeSet<String>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine().trim();
            String[] a1 = s1.split("\\s+");
            String s2 = sc.nextLine().trim();
            String[] a2 = s2.split("\\s+");
            for (String x : a1)
                a.add(x);
            for (String x : a2)
                b.add(x);
            for (String x : a)
                if (b.contains(x) == false)
                    System.out.print(x + " ");
            a.clear();
            b.clear();
            System.out.println();
        }
    }
}
