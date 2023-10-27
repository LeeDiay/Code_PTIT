/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author DELL
 */
public class TH_NhonhatVaLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedSet<String> sA = new TreeSet<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            sA.addAll(Arrays.asList(sc.nextLine().toLowerCase().split("\\s+")));
        }

        SortedSet<String> sB = new TreeSet<>();
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            sB.addAll(Arrays.asList(sc.nextLine().toLowerCase().split("\\s+")));
        }

        Set<String> tmp = new TreeSet<>(sA);
        sA.removeAll(sB);
        sB.removeAll(tmp); // sA luc nay da khac roi, khong removeAll(sA) duoc

        for (String i : sA) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (String i : sB) {
            System.out.print(i + " ");
        }
    }
}
