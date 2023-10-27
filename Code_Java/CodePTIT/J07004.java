/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] dd = new int[1000];
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.next());
            dd[n]++;
        }
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d %d\n", i, dd[i]);
        }
    }
}
