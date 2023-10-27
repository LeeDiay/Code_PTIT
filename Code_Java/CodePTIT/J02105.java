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
public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[1000][1000];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ", i+1);
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1 ) {
                    System.out.printf("%d ", j+1);
                }
            }
            System.out.println();
        }
    }
}
