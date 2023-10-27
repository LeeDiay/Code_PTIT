/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.*;

/**
 *
 * @author DELL
 */
public class J02034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000];
        int[] dd = new int[205];
        int last = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            last = a[i];
            dd[a[i]]++;
        }
        int check = 1;
        for (int i = 1; i <= last; i++) {
            if (dd[i] == 0) {
                check = 0;
                System.out.println(i);
            }
        }
        if (check == 1) {
            System.out.println("Excellent!");
        }
    }
}
