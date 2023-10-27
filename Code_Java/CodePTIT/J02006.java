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
public class J02006 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int m = ip.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] dd = new int[1005];

        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
            dd[a[i]] = 1;
        }
        for (int i = 0; i < m; i++) {
            b[i] = ip.nextInt();
            dd[b[i]] = 1;
        }

        for (int i = 1; i <= 1000; i++) {
            if (dd[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
