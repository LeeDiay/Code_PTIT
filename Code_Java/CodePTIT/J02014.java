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
public class J02014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int check = 0;
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] l = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            l[0] = a[0];
            for (int i = 1; i < n; i++) {
                l[i] = l[i - 1] + a[i];
            }
            for (int i = 0; i < n; i++) {
                if (l[i] == sum - l[i] + a[i]) {
                    System.out.println(i+1);
                    check = 1;
                    break;
                }
            }
            if (check == 0)
                System.out.println("-1");
        }
    }
}
