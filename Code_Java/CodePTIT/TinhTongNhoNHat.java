/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TinhTongNhoNHat {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        //sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) 
                arr[i] = sc.nextInt();
            long a = 0;
            long b = 0;
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    a = a * 10 + arr[i];
                } 
                else {
                    b = b * 10 + arr[i];
                }
            }
            System.out.println(a + b);
        }
    }
}
